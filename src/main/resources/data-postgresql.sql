/*TRUNCATE TABLE election.person cascade;
TRUNCATE TABLE election.region cascade;
TRUNCATE TABLE election.commission cascade;
TRUNCATE TABLE election.vote cascade;
TRUNCATE TABLE election.party cascade;
TRUNCATE TABLE election.candidate cascade;
TRUNCATE TABLE election.district cascade;

ALTER SEQUENCE election.region_region_id_seq RESTART WITH 1;
ALTER SEQUENCE election.observer_observer_id_seq RESTART WITH 1;
ALTER SEQUENCE election.station_id_seq RESTART WITH 1;
ALTER SEQUENCE election.campaign_campaign_id_seq RESTART WITH 1;
ALTER SEQUENCE election.candidate_candidate_id_seq RESTART WITH 1;
ALTER SEQUENCE election.party_party_id_seq RESTART WITH 1;
ALTER SEQUENCE election.district_district_id_seq RESTART WITH 1;

INSERT INTO election.region (name,rank,parent_region_id)
VALUES
('Российская Федерация',0,null),
('Москва',1,1),
('Санкт-Петербург',1,1),
('Липецкая область',1,1),
('Липецк',2,4),
('Елец',2,4);

INSERT INTO election.commission (number,city_region_id,address,name,parent_id) VALUES
(32,2,'Студенческая ул, д 3','Территориальная избирательная комиссия №32 по району Дорогомилово',null),
(34,2,'Случайная ул, д 34 к 1','Территориальная избирательная комиссия №32 по району Фили-Давыдково',null),
(2562,2,'Кутузовский пр, д 15/3','Участковая избирательная комиссия №2562',1),
(2563,2,'Кутузовский пр, д 15/3','Участковая избирательная комиссия №2563',1),
(2550,2,'Студенческая ул, д 55','Участковая избирательная комиссия №2550',2),
(222,5,'Липецкая ул, д 1','Участковая избирательная комиссия №222',1);

INSERT INTO election.vote(short_name,name,start_date,end_date,region_id) VALUES
('ГД 2021','Выборы в Госдуму XII созыва','2021-09-17','2021-09-19',1),
('МГД 2024','Выборы в Московскую городскую думу 2024','2024-09-08','2024-09-08',2),
('Поправки в конституцию','Голосование по поправкам в конституцию 2020','2020-06-25','2020-07-01',5),
('Горсовет Елец','Выборы в городской совет г.Ельца','2022-05-20','2022-05-20',6);

INSERT INTO election.person (activity,birth,commission,education,f_name,l_name,m_name,phone,region_region_id)
VALUES
('Студент','2000-03-01',null,'н/высшее','Иванов','Иван','Иванович','+79155542222',2),
('Студент','1988-06-13',null,'высшее','Берг','Василий',null,'+79155542223',2),
('Студент','2002-03-01',null,'среднее общее','Лоскутов','Дмитрий','Алексеевич','+79155542224',3),
('Студент','1999-03-01',null,'н/высшее','Листов','Андрей','Максимович','+79155542225',5);

INSERT INTO election.party(name,short_name) VALUES
('Комунистическая партия Российской Федерации','КПРФ'),
('Партия ЯБЛОКО','Яблоко'),
('Справедливая россия','СР');

INSERT INTO election.candidate(name) VALUES
('Лобанов Михаил'),
('Ильян Яков'),
('Ирина Жданова');

INSERT INTO election.district(name,number,campaign_campaign_id,region_region_id) VALUES
('Кунцевский одномандатный избирательный округ',197,1,2),
('Бабушкинский одномандатный избирательный округ',196,1,2),
('Левобережный одномандатный избирательный округ',115,1,4),
('Басманный, Красносельский, Мещанский, Сокольники',45,2,2),
('Избирательный округ №10',10,4,6);*/

TRUNCATE TABLE election.region cascade;
TRUNCATE TABLE election.person cascade;
TRUNCATE TABLE election.lead cascade;

ALTER SEQUENCE election.region_id_seq RESTART WITH 1;
ALTER SEQUENCE election.person_id_seq RESTART WITH 1;
ALTER SEQUENCE election.lead_id_seq RESTART WITH 1;

INSERT INTO election.region (name,rank,parent_region_id)
VALUES
('Российская Федерация',0,null),
('Москва',1,1),
('Санкт-Петербург',1,1),
('Липецкая область',1,1),
('Липецк',2,4),
('Елец',2,4);

INSERT INTO election.person(activity,birth,education,f_name,l_name,m_name,phone,region_id) VALUES
('Студент','2000-03-01','н/высшее','Иванов','Иван','Иванович','+79155542222',2),
('Студент','1988-06-13','высшее','Берг','Василий',null,'+79155542223',2),
('Студент','2002-03-01','среднее общее','Лоскутов','Дмитрий','Алексеевич','+79155542224',3),
('Студент','1999-03-01','н/высшее','Листов','Андрей','Максимович','+79155542225',5);

INSERT INTO election.lead(coordinator_id,person_id) VALUES
(1,2),
(1,3),
(1,4),
(2,4);