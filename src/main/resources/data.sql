DROP TABLE IF EXISTS customer;

create table customer (
    customer_num bigint not null,
    city varchar(255),
    district varchar(255),
    name varchar(255),
    surname varchar(255),
    primary key (customer_num)
);

INSERT INTO customer (customer_num, name, surname, city, district) VALUES
  (1, 'Adam', 'Avery', 'Maryland', 'Baltimore'),
  (2, 'Joseph', 'Bower', 'Nebraska', 'Lincoln'),
  (3, 'Liam', 'Campbell', 'New Jersey', 'Trenton');