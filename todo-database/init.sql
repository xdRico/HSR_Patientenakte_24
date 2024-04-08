CREATE TABLE IF NOT EXISTS todo_item (
    todo_item_id SERIAL PRIMARY KEY,
    todo_item_name VARCHAR(50) NOT NULL,
    todo_item_description VARCHAR(255),
    due_date TIMESTAMP
);

INSERT INTO todo_item(todo_item_name, todo_item_description)
VALUES ('Todo Test 1', 'Dies ist eine Test Aufgabe'); 