# UAS-GUI-NETBEANS2

## Scheme
```sql
CREATE DATABASE farhan_store;
USE farhan_store;

CREATE TABLE login(
    username VARCHAR(100) NOT NULL UNIQUE PRIMARY KEY,
    password VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE tb_merchant_farhan(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    balance DECIMAL DEFAULT 0
);

CREATE TABLE tb_product_farhan(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    price VARCHAR(50) NOT NULL,
    merchant_id INT NOT NULL,
    FOREIGN KEY (merchant_id) REFERENCES tb_merchant_farhan(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE tb_transaction_farhan(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    status ENUM('SELL','BUY') NOT NULL
);

#  login
INSERT INTO login VALUES ('farhan',19071039);

# data
INSERT INTO tb_merchant_farhan(name, email) VALUES ('farhan','farhan@gmail.com');
INSERT INTO tb_merchant_farhan(name, email) VALUES ('farhan2','farhan2@gmail.com');
INSERT INTO tb_merchant_farhan(name, email) VALUES ('farhan3','farhan3@gmail.com');
INSERT INTO tb_merchant_farhan(name, email) VALUES ('farhan4','farhan4@gmail.com');
INSERT INTO tb_merchant_farhan(name, email) VALUES ('farhan5','farhan5@gmail.com');

INSERT INTO tb_product_farhan(name, price, merchant_id) VALUES ('Iphone X', '30000000','1');
INSERT INTO tb_product_farhan(name, price, merchant_id) VALUES ('Samsung A9', '30000000','2');
INSERT INTO tb_product_farhan(name, price, merchant_id) VALUES ('Galaxy Fold', '50000000','2');
INSERT INTO tb_product_farhan(name, price, merchant_id) VALUES ('Macbook pro M1', '24000000','3');
```

# clone, open in your netbeans IDE, and run :)
