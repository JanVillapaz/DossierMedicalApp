CREATE TABLE doctors (
    username VARCHAR(25),
    nom VARCHAR(25),
    password VARCHAR(20)
);

INSERT INTO doctors (username, nom, password) VALUES ('jvillapaz', 'Jan Villapaz', 'password');
INSERT INTO doctors (username, nom, password) VALUES ('nousman', 'Nana O', 'password2');
INSERT INTO doctors (username, nom, password) VALUES ('ccheniti', 'Cyrine C', 'password3');

select * from doctors