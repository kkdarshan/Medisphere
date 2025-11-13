INSERT INTO users (idusers, username, email, password_hash, fullname, role) 
VALUES (1, 'john.doe', 'john.doe@example.com', 'hashed_secure_password', 'John Doe', 'administrator');
INSERT INTO users (idusers, username, email, password_hash, fullname, role) 
VALUES (2, 'jane.smith', 'jane.smith@example.com', 'another_secure_hash_2', 'Jane Smith', 'user');
INSERT INTO users (idusers, username, email, password_hash, fullname, role) 
VALUES (3, 'mike.j', 'mike.johnson@example.com', 'hash_for_mike_3', 'Mike Johnson', 'moderator');
INSERT INTO users (idusers, username, email, password_hash, fullname, role) 
VALUES (4, 'alice.b', 'alice.brown@example.com', 'alice_brown_hash_4', 'Alice Brown', 'user');

SELECT * FROM medisphere.users;

INSERT INTO doctors (iddoctors, specialization, license_number, phono) 
VALUES (101, 'Cardiology', 'L1234567A', '555-0101');
INSERT INTO doctors (iddoctors, specialization, license_number, phono) 
VALUES (102, 'Pediatrics', 'L8901234B', '555-0102');
INSERT INTO doctors (iddoctors, specialization, license_number, phono) 
VALUES (103, 'Orthopedics', 'L5678901C', '555-0103');
INSERT INTO doctors (iddoctors, specialization, license_number, phono) 
VALUES (104, 'Dermatology', 'L2345678D', '555-0104');

SELECT * FROM medisphere.doctors;

INSERT INTO patients (idpatients, DOB, phono, emergency_contact, address) 
VALUES (201, '1985-05-15', '555-1201', 'John Doe (Husband) 555-1202', '123 Oak St, Anytown, USA');
INSERT INTO patients (idpatients, DOB, phono, emergency_contact, address) 
VALUES (202, '1992-11-20', '555-1203', 'Jane Smith (Mother) 555-1204', '456 Pine Ave, Othercity, USA');
INSERT INTO patients (idpatients, DOB, phono, emergency_contact, address) 
VALUES (203, '1970-01-01', '555-1205', 'Mike Johnson (Son) 555-1206', '789 Birch Ln, Newville, USA');
INSERT INTO patients (idpatients, DOB, phono, emergency_contact, address) 
VALUES (204, '2005-08-30', '555-1207', 'Alice Brown (Father) 555-1208', '101 Maple Blvd, Oldtown, USA');

SELECT * FROM medisphere.patients;

INSERT INTO departments (iddepartments, name)
VALUES (106, 'Neurology');
INSERT INTO departments (iddepartments, name)
VALUES (107, 'geologist');
INSERT INTO departments (iddepartments, name)
VALUES (108, 'thermologist');
INSERT INTO departments (iddepartments, name)
VALUES (109, 'Dermatology');

SELECT * FROM medisphere.departments;