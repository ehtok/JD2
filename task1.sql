/* Первичный ключ*/
Create table people.users
(
    id   INT auto_increment not null,
    name varchar(20)        not null,
    primary key (id)
);

insert people.users(name)
values ('Pasha'),
       ('Egor'),
       ('Nick'),
       ('Elena');

/*Вторичный ключ*/

Create table people.goods
(
    order_id INT auto_increment not null,
    user_id  INT,
    primary key (order_id),
    constraint fk_user_id foreign key (user_id)
        references users (id)
);

Alter table people.goods
    add column order_name varchar(200) not null;

INSERT goods(order_name)
values ('mobile'),
       ('CPU'),
       ('HDD'),
       ('T-shirt');


/*order by ASC DESC*/

select *
from people.users
order by name desc;
select *
from people.users
order by name asc;

select *
from goods
order by order_name asc;

/*соединение таблиц*/

Select *
from goods
         INNER JOIN users on people.goods.order_name = users.name;
Select *
from goods
         LEFT OUTER JOIN users on people.goods.order_id = users.id;

Select *
from goods
         right outer join users on order_id = users.id;

/*union*/

Select order_id
from goods
union
Select id
from users;

/*подстановочные знаки*/

Select *
from users
where name like '%a';
Select *
from goods
where people.goods.order_name like 'T_shirt';

/* aliases*/

Select order_name AS good
from goods;


/*INSERT INTO SELECT*/

Insert Into goods(people.goods.order_name)
SELECT name
from users;











