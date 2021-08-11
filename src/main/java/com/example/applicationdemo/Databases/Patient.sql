CREATE TABLE Patient(
                        noAssuranceMaladie VARCHAR (12) NOT NULL PRIMARY KEY,
                        nom VARCHAR(15),
                        prenom VARCHAR(15),
                        dateNaissance DATE,
                        genre CHAR (1) CHECK  (genre='F' OR genre='M'),
                        villeDeNaissance VARCHAR (15),
                        nomParent VARCHAR (25),
                        telephone NUMERIC (10),
                        FOREIGN KEY (telephone) REFERENCES Coordonnees
);

INSERT INTO Patient VALUES ('OUSN12345678','ousmane','nana','1997-02-25','F','Montreal','Linda goyer',5147012297);
INSERT INTO Patient VALUES ('CHEC12345678','cheniti','cyrine','1997-12-17','F','Gaspésie','Anna Wayne',4387221234);
INSERT INTO Patient VALUES ('VILJ12345678','villapaz','jan','1994-07-24','F','Laval','Eunice Villapaz',6131231287);
