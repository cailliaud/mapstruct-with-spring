INSERT INTO CHAT (ID, CREATION_TIME, MODIFICATION_TIME, VERSION, PRENOM, AGE, RACE) VALUES
(nextVal('CHAT_SEQUENCE'),current_timestamp(),null,0,'Ahsoka',3,'Européen'),
(nextVal('CHAT_SEQUENCE'),current_timestamp(),null,0,'Lulu',10,'Européen'),
(nextVal('CHAT_SEQUENCE'),current_timestamp(),null,0,'Moustique',7,'Européen'),
(nextVal('CHAT_SEQUENCE'),current_timestamp(),null,0,'Agrippine',7,'Européen');

INSERT INTO HOTEL (ID, CREATION_TIME, MODIFICATION_TIME, VERSION,  NOM)
VALUES (nextVal('HOTEL_SEQUENCE'), current_timestamp(), null, 0, 'Le chat perché');

INSERT INTO RESPONSABLE (ID, CREATION_TIME, MODIFICATION_TIME, VERSION, PRENOM, NOM, EMAIL,HOTEL_ID)
VALUES (nextVal('RESPONSABLE_SEQUENCE'), current_timestamp(), null, 0, 'Alexandre', 'Cailliaud', 'test@exammple.com',(select id from hotel where nom ='Le chat perché'));