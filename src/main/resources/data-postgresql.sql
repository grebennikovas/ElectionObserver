TRUNCATE TABLE election.observer cascade;
TRUNCATE TABLE election.region cascade;
TRUNCATE TABLE election.station cascade;

ALTER SEQUENCE election.region_region_id_seq RESTART WITH 1;
ALTER SEQUENCE election.observer_observer_id_seq RESTART WITH 1;
ALTER SEQUENCE election.station_id_seq RESTART WITH 1;

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

INSERT INTO election.station (number,city_region_id,address,name,parent_id) VALUES
(32,2,'Студенческая ул, д 3','Территориальная избирательная комиссия №32 по району Дорогомилово',null),
(34,2,'Случайная ул, д 34 к 1','Территориальная избирательная комиссия №32 по району Фили-Давыдково',null),
(2562,2,'Кутузовский пр, д 15/3','Участковая избирательная комиссия №2562',1),
(2563,2,'Кутузовский пр, д 15/3','Участковая избирательная комиссия №2563',1),
(2550,2,'Студенческая ул, д 55','Участковая избирательная комиссия №2550',2),
(222,5,'Липецкая ул, д 1','Участковая избирательная комиссия №222',1);