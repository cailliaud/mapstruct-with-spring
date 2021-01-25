CREATE SEQUENCE HOTEL_SEQUENCE START WITH 0 INCREMENT BY 1;
CREATE TABLE HOTEL
(
    ID                BIGINT IDENTITY,
    CREATION_TIME     TIMESTAMP NOT NULL,
    MODIFICATION_TIME TIMESTAMP,
    VERSION           INT       NOT NULL,
    NOM               VARCHAR   NOT NULL
);


CREATE SEQUENCE RESPONSABLE_SEQUENCE START WITH 0 INCREMENT BY 1;
CREATE TABLE RESPONSABLE
(
    ID                BIGINT IDENTITY,
    CREATION_TIME     TIMESTAMP NOT NULL,
    MODIFICATION_TIME TIMESTAMP,
    VERSION           INT       NOT NULL,
    PRENOM            VARCHAR   NOT NULL,
    NOM               VARCHAR   NOT NULL,
    EMAIL             VARCHAR   NOT NULL,
    HOTEL_ID          BIGINT    NOT NULL,
    FOREIGN KEY (HOTEL_ID) references HOTEL (ID)

);
CREATE UNIQUE INDEX RESPONSABLE_INDEX ON RESPONSABLE (ID);

CREATE SEQUENCE CHAT_SEQUENCE START WITH 0 INCREMENT BY 1;
CREATE TABLE CHAT
(
    ID                BIGINT IDENTITY,
    CREATION_TIME     TIMESTAMP NOT NULL,
    MODIFICATION_TIME TIMESTAMP,
    VERSION           INT       NOT NULL,
    PRENOM            VARCHAR   NOT NULL,
    AGE               SMALLINT  NOT NULL,
    RACE              VARCHAR   NOT NULL,
    HOTEL_ID          BIGINT,
    FOREIGN KEY (HOTEL_ID) references HOTEL (ID)
);
CREATE UNIQUE INDEX CHAT_INDEX ON CHAT (ID);

