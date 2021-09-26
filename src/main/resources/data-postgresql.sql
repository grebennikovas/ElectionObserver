TRUNCATE TABLE election.observer;
TRUNCATE TABLE election.region;

ALTER SEQUENCE election.region_region_id_seq RESTART WITH 1;
ALTER SEQUENCE election.observer_observer_id_seq RESTART WITH 1;

INSERT INTO election.observer (activity,birth,commission,education,f_name,l_name,m_name,phone)
VALUES
('Студент','2000-03-01',null,'н/высшее','Иванов','Иван','Иванович','+79155542222'),
('Студент','1988-06-13',null,'высшее','Берг','Василий',null,'+79155542223'),
('Студент','2002-03-01',null,'среднее общее','Лоскутов','Дмитрий','Алексеевич','+79155542224'),
('Студент','1999-03-01',null,'н/высшее','Листов','Андрей','Максимович','+79155542225');

INSERT INTO election.region (name,rank,parent_region_id)
VALUES
('Российская Федерация',0,null),
('Москва',1,1),
('Санкт-Петербург',1,1),
('Липецкая область',1,1),
('Липецк',2,4);