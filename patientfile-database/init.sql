CREATE SEQUENCE patientfile_item_seq START 1;

CREATE TABLE IF NOT EXISTS patientfile_item (
    patientfile_item_id SERIAL PRIMARY KEY,
    patientfile_item_name VARCHAR(50) NOT NULL,
    patientfile_item_description VARCHAR(255),
    due_date TIMESTAMP
);

INSERT INTO patientfile_item(patientfile_item_name, patientfile_item_description)
VALUES ('Patientfile Test 1', 'Dies ist eine Test Aufgabe'); 