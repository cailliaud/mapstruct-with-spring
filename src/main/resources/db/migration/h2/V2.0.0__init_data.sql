INSERT INTO HOTEL (ID, CREATION_TIME, MODIFICATION_TIME, VERSION, NOM)
VALUES (nextVal('HOTEL_SEQUENCE'), current_timestamp(), null, 0, 'Le chat perché');

INSERT INTO RESPONSABLE (ID, CREATION_TIME, MODIFICATION_TIME, VERSION, PRENOM, NOM, EMAIL, HOTEL_ID)
VALUES (nextVal('RESPONSABLE_SEQUENCE'), current_timestamp(), null, 0, 'Alexandre', 'Cailliaud', 'test@exammple.com',
        (select id from hotel where nom = 'Le chat perché'));

INSERT INTO CHAT (ID, CREATION_TIME, MODIFICATION_TIME, VERSION, PRENOM, AGE, RACE, HOTEL_ID)
VALUES (nextVal('CHAT_SEQUENCE'), current_timestamp(), null, 0, 'Ahsoka', 3, 'Européen',
        (select id from hotel where nom = 'Le chat perché')),
       (nextVal('CHAT_SEQUENCE'), current_timestamp(), null, 0, 'Lulu', 10, 'Européen', null),
       (nextVal('CHAT_SEQUENCE'), current_timestamp(), null, 0, 'Moustique', 7, 'Européen', null),
       (nextVal('CHAT_SEQUENCE'), current_timestamp(), null, 0, 'Agrippine', 7, 'Européen', null);
