CREATE
    DATABASE order_db;

CREATE TABLE orders
(
    id        SERIAL PRIMARY KEY,
    client_id BIGINT       NOT NULL,
    product   VARCHAR(255) NOT NULL
);