CREATE TABLE IF NOT EXISTS book (
    isbn VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    author VARCHAR(100),
    price DECIMAL(10, 2)
);
