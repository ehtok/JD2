Create DATABASE people;
create table Person
(
    id             int auto_increment not null primary key,
    age            int                null,
    salary         double             null,
    passport       char(10)           null,
    address        char(200)          null,
    dateOfBirthday DATE               not null,
    dateTimeCreate DATETIME           not null,
    timeToLunch    TIME               not null,
    letter         text
);

INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (15, 231.2, 'MP2345321', 'г.Минск', '2007-02-01', NOW(), 12.00, 'Fist Person ');
INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (33, 528, 'MP2346521', 'г.Брест>', '1989-03-08', NOW(), '12:20', 'Second Person ');
INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (20, 1000, 'MВ2345931', 'г.Гродно', '2001-09-30', NOW(), '11:00', 'Third Person ');
INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (50, 804.2, 'MC5545321', 'г.Воложин', '1971-11-22', NOW(), '13:30', 'Fourth Person ');
INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (44, 1536.22, 'MW2346621', 'г.Минск', '1978-06-15', NOW(), '13:00', 'Fifth Person ');
INSERT Person(age, salary, passport, address, dateOfBirthday, dateTimeCreate, timeToLunch, letter)
VALUES (18, 451.2, 'MS2826621', 'г.Могилев', '2003-05-30', NOW(), '10:00', 'Sixth Person ');

SELECT *
from Person
where age < 21
  AND Person.dateTimeCreate
order by dateTimeCreate DESC;