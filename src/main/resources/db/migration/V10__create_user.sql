create table user_tbl
(
    id         serial primary key,
    first_name varchar(100) not null,
    last_name  varchar(150) not null,
    email      varchar(150) not null,
    password   varchar(100) not null
);