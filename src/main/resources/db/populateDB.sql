DELETE FROM projects;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO projects (modified, description, manager, name) VALUES ('2015-01-06 09:00:01', 'project1', 'dan', 'project1');
INSERT INTO projects (modified, description, manager, name) VALUES ('2015-02-06 09:00:01', 'project2', 'jan', 'project2');
INSERT INTO projects (modified, description, manager, name) VALUES ('2015-03-06 09:00:01', 'project3', 'bob', 'project3');
