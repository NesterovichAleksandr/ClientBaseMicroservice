CREATE
    DATABASE client_db;

CREATE TABLE client
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL
);