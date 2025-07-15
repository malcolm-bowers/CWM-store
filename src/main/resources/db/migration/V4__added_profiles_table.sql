create table profiles
(
    id             bigint PRIMARY KEY,
    bio            text,
    phone_number   varchar(15),
    date_of_birth  date,
    loyalty_points INT UNSIGNED default 0,
    FOREIGN KEY (id) references users(id)
);

