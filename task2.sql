/*Как выбрать записи с нечётными Id?*/

create table cars
(
    id    INT auto_increment not null,
    name  varchar(200)       not null,
    color varchar(200),
    primary key (id)
);

insert cars(name, color)
VALUES ('BMW', 'grey'),
       ('Lada', 'red'),
       ('Geely', 'blue'),
       ('Mazda', 'black');

select *
from cars
where id % 2 != 0;

/*Как найти дубли в поле email?*/

create table customers
(
    id            INT auto_increment not null,
    name          varchar(200),
    email         varchar(200),
    age           INT                not null,
    register_date DATE,
    primary key (id)
);

insert customers(name, email, age, register_date)
VALUES ('Pasha', 'Pasha111@mail.ru', 19, now()),
       ('Nikita', 'Nikita123@gmail.com', 22, '2015.03.20'),
       ('Milana', 'Milana62@mail.ru', 30, '2018.05.15'),
       ('Dima', 'Dima007@gmail.com', 25, '2020.01.03'),
       ('Pasha', 'Pasha111@mail.ru', 25, '2019.07.20');

select email, count(email)
from customers
group by email
having count(email) > 1;

/*При выборке из таблицы прибавьте к дате 1 день*/

select DATE_ADD(register_date, INTERVAL 1 YEAR) as new_date
from customers;

/*Выберите только уникальные имена*/

select distinct name
from customers;

/*Найдите в таблице среднюю зарплату работников*/

Create table departments
(
    id         INT auto_increment not null,
    department varchar(200),
    constraint departments_id_pk
        primary key (id)
);

insert departments(department)
values ('Sales department'),
       ('HR department'),
       ('Product department');

Create table workers
(
    id            INT auto_increment not null,
    position      varchar(200),
    salary        DEC,
    department_id INT,
    constraint workers_id_pk
        primary key (id),
    constraint workers_department_id_fk
        foreign key (department_id) References departments (id)
);

insert workers(position, salary, department_id)
VALUES ('engineer', 500, 1),
       ('developer', 400, 1),
       ('teacher', 150, 2),
       ('worker', 200, 2);

select avg(salary)
from workers;

/*список сотрудников с зарплатой выше средней*/

select *
from workers
where salary > (select avg(salary) from workers);


/*Найдите все департаменты без единого сотрудника*/
select department
from departments
         right join workers w on departments.department = w.department_id
where departments.department is null;

/*Замените в таблице зарплату работника*/

update workers
SET salary=
        case
            when salary = 150 then 200
            else 400
            end;

/*При выборке из таблицы пользователей создайте поле, которое будет включать в себя и имена, и зарплату*/

select concat(salary, position) as new_field
from workers;

/*Переименуйте таблицу*/

create table first_table
(
    id INT auto_increment not null,
    constraint fist_id_pk
        primary key (id)
);
alter table first_table rename second_table;


