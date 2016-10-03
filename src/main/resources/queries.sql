CREATE TABLE students (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(45) NOT NULL,
                    group_id INT);

CREATE TABLE groups (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                     name VARCHAR(45) NOT NULL
);

CREATE TABLE subjects (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(45) NOT NULL,
                       description VARCHAR(255)
);

CREATE TABLE teachers (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(45) NOT NULL,
                       experience INT,
                       subject_id INT
);

CREATE TABLE groups_subjects (group_id INT,
                              subject_id INT
);

ALTER TABLE users
  ADD FOREIGN KEY(group_id)
REFERENCES ACP14.groups(id);

ALTER TABLE teachers
  ADD FOREIGN KEY(subject_id)
REFERENCES ACP14.subjects(id);