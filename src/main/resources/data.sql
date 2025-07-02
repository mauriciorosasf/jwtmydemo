INSERT INTO users(id, username,password) VALUES
(1,'user','$2a$10$5PiyN0MsG0y886d8xWXtwumRIHeBYdcg08OLJGUyGiZFZXEpCm5Oy'),
(2,'staff','$2a$10$gqHrslMttQWSsDSVRTK1Oe7hIXD.DVnw69k48spOlxEbAGVaKLFEC');

INSERT INTO roles(id,name) VALUES (1,'ROLE_STAFF'),(2,'ROLE_USER');

INSERT INTO users_roles (role_id,user_id) VALUES (2,1),(1,2);