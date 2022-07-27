DROP TABLE if exists PLAYER;

CREATE TABLE PLAYER (
    id LONG AUTO_INCREMENT primary key ,
    firstName varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    hometown varchar(75) NOT NULL,
    dob varchar(10) NOT NULL,
    teamPlayingFor varchar(50) not null,
    sport varchar (50) not null
);

DROP TABLE if exists MLB;

CREATE TABLE MLB (
    sport varchar(50) not null ,
    team varchar(75) NOT NULL ,
    wins varchar(3) NOT NULL,
    losses varchar(3) NOT NULL,
    nextGame varchar(10) NOT NULL
);

DROP TABLE if exists NFL;

CREATE TABLE NFL (
                     sport varchar(50) not null ,
                     team varchar(75) NOT NULL ,
                     wins varchar(3) NOT NULL,
                     losses varchar(3) NOT NULL,
                     nextGame varchar(10) NOT NULL
);

DROP TABLE if exists MLS;

CREATE TABLE MLS (
                     sport varchar(50) not null ,
                     team varchar(75) NOT NULL ,
                     wins varchar(3) NOT NULL,
                     losses varchar(3) NOT NULL,
                     nextGame varchar(10) NOT NULL
);

