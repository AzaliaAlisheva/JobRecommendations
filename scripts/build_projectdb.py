"""Script to build and populate the project database with initial data."""

import os
import psycopg2 as psql

# Read password from secrets file
SECRETS_FILE = os.path.join("secrets", ".psql.pass")
with open(SECRETS_FILE, "r", encoding="utf-8") as file:
    PASSWORD = file.read().rstrip()

# Build connection string
CONN_STRING = (
    f"host=hadoop-04.uni.innopolis.ru port=5432 user=team17 "
    f"dbname=team17_projectdb password={PASSWORD}"
)


def truncate_long_fields(row_data, max_length=100):
    """Truncate only string fields that exceed max_length."""
    truncated = []
    for field in row_data:
        if isinstance(field, str) and len(field) > max_length:
            truncated.append(field[:max_length] + '...')
        else:
            truncated.append(field)
    return tuple(truncated)


# Connect to the remote dbms
with psql.connect(CONN_STRING) as main_connection:
    # Create a cursor for executing psql commands
    main_cursor = main_connection.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "create_tables.sql"), "r", encoding="utf-8") as sql_file:
        sql_content = sql_file.read()
        main_cursor.execute(sql_content)
    main_connection.commit()

    with open(os.path.join("data", "window_dates.tsv"), "r", encoding="utf-8") as window_dates:
        next(window_dates)
        main_cursor.copy_expert(("COPY window_dates FROM STDIN WITH (FORMAT TEXT, "
                                 "DELIMITER '\t', NULL '');"), window_dates)
    with open(os.path.join("data", "users.tsv"), "r", encoding="utf-8") as users:
        next(users)
        main_cursor.copy_expert(("COPY users FROM STDIN WITH (FORMAT TEXT, "
                                 "DELIMITER '\t', NULL '');"), users)
    with open(os.path.join("data", "user_history.tsv"), "r", encoding="utf-8") as user_history:
        next(user_history)
        main_cursor.copy_expert(("COPY user_history FROM STDIN WITH (FORMAT TEXT, "
                                 "DELIMITER '\t', NULL '');"), user_history)
    with open(os.path.join("data", "jobs.tsv"), "r", encoding="utf-8") as jobs:
        next(jobs)
        main_cursor.copy_expert(("COPY jobs FROM STDIN WITH (FORMAT TEXT, "
                                 "DELIMITER '\t', NULL '');"), jobs)
    with open(os.path.join("data", "apps.tsv"), "r", encoding="utf-8") as apps:
        next(apps)
        main_cursor.copy_expert(("COPY apps (userid, windowid, split, date, jobid) "
                                 "FROM STDIN WITH (FORMAT TEXT, "
                                 "DELIMITER '\t', NULL '');"), apps)
    main_connection.commit()
    print(main_connection)

    main_cursor = main_connection.cursor()
    # Read the sql commands from the file

    with open(os.path.join("sql", "test_database.sql"), "r", encoding="utf-8") as sql_file:
        sql_commands = sql_file.readlines()
        for sql_command in sql_commands:
            sql_command = sql_command.strip()
            if not sql_command:
                continue

            print(f"\n{'='*60}")
            print(f"Query: {sql_command}")
            print(f"{'='*60}")

            main_cursor.execute(sql_command)

            if main_cursor.description:  # SELECT query
                query_rows = main_cursor.fetchall()
                print(f"Rows returned: {len(query_rows)}")

                if query_rows:
                    # Print column headers
                    col_names = [desc[0] for desc in main_cursor.description]
                    print(f"Columns: {', '.join(col_names)}")
                    print("-" * 60)

                    # Print rows with long fields truncated
                    for row_idx, current_row in enumerate(query_rows, 1):
                        truncated_row = truncate_long_fields(current_row, 150)
                        print(f"Row {row_idx}: {truncated_row}")
                else:
                    print("No rows returned")
            else:
                print(f"Query executed, rows affected: {main_cursor.rowcount}")
