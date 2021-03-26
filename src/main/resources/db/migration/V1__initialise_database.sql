DROP SCHEMA IF EXISTS mcve CASCADE;

CREATE DOMAIN enumdomain AS ENUM ('x', 'y');

CREATE SCHEMA mcve;

CREATE TABLE mcve.test (
  id    INT NOT NULL AUTO_INCREMENT,
  problemcolumn enumdomain,
  notbetter enumdomain,

  CONSTRAINT pk_test PRIMARY KEY (id) 
);