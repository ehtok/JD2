create table workers
(
    id          INT auto_increment not null,
    surname     char(200),
    name        char(200),
    middle_name char(200),
    constraint workers_pk
        primary key (id)
);

insert workers(surname, name, middle_name)
VALUES ('Смирнов', 'Сергей', 'Сергеевич'),
       ('Федоров', 'Сергей', 'Юрьевич'),
       ('Петров', 'Петя', 'Сергеевич');

create table project
(
    project_id     INT auto_increment not null,
    project_name   char(200),
    hardness       char(200),
    project_time   char(200),
    project_master INT,
    constraint project_master_workers_fk
        foreign key (project_master) references workers (id),
    constraint project_id_pk
        primary key (project_id)
);

insert project(project_name, hardness, project_time, project_master)
values ('Проект 1', 'Сложный', '2 дня', 1),
       ('Проект 2', 'Легкий', '1 день', 2);

create table task
(
    task_id      INT auto_increment not null,
    task_name    char(200),
    project_id INT,
    constraint project_name_task_fk
        foreign key (project_id) references project (project_id),
    task_time    char(200),
    task_price   char(200),
    task_master  INT,
    constraint task_master_fk
        foreign key (task_master) references workers (id),
    constraint task_id_pk
        primary key (task_id)
);

insert task(project_id, task_name, task_time, task_price, task_master)
VALUES (1, 'Задача 1', '4 часа', '2000', 3),
       (1, 'Задача 2', '8 часов', '2500', 1),
       (1, 'Задача 3', '4 часа', '1000', 1),
       (2, 'Задача 4', '5 часов', '3000', 2),
       (2, 'Задача 5', '3 часа', '500', 3);

select project.hardness, task_name
from project
         join task t on project.project_id = t.project_id
where hardness like 'Сложный';

select sum(task_price)
from task;

select project.project_name, sum(task_price)
from project
         join task t on project.project_id = t.project_id
group by project.project_name;

select project.project_name, sum(task_price)
from project
         join task t on project.project_id = t.project_id
group by project.project_name
having sum(task_price) > 4000;

update project SET project_name =
case
when project_name= 'Проект 1' then 'Проект 25'
    else 'Проект 2'
end ;








