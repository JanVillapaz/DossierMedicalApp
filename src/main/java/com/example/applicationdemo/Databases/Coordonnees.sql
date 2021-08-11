CREATE TABLE Coordonnees (
                             telephone NUMERIC (10) NOT NULL PRIMARY KEY ,
                             adresse VARCHAR(30),
                             courriel VARCHAR (25)  CHECK (courriel LIKE '%@%')
);