CREATE TABLE person (
  id integer not null,
  name varchar(255) not null,
  location varchar(255),
  birth_date timestamp,
  primary key(id)
);

INSERT INTO person (id, name, location, birth_date) VALUES(100001, 'Jeff', 'Chicago', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(100002, 'Jane', 'Los Angeles', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(100003, 'Joe', 'New York', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(100004, 'Sue', 'London', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(100005, 'Sean', 'Chicago', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(100006, 'Steve', 'Chicago', sysdate());