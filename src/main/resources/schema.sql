CREATE TABLE roles(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR (25),
    PRIMARY KEY ( id )
);

CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(256),
    last_name VARCHAR(256),
    email VARCHAR(256),
    password VARCHAR(256),
    role_id INT NOT NULL,
    PRIMARY KEY ( id ),
   FOREIGN KEY(role_id) REFERENCES roles(id)
);

CREATE TABLE entries (
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(256),
    content TEXT,
    author_id INT NOT NULL,
    publish_date DATETIME,
    PRIMARY KEY ( id ),
   FOREIGN KEY(author_id) REFERENCES users(id)
);
