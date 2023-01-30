# ABOUT

This repo is for Java and Spring frameworks.

Practice and excercises are based on `The essence of Java` written by Gungseong Nam and his channel

https://www.youtube.com/watch?v=oJlCC1DutbA&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp

## Directories

* fundamentals

  Java fundamental excercises

* javajungsuk_basic-master

* spring_

  practice with Java & spring

* mycrud

  practice for creating CRUD in Java and spring with DB


## CRUD project

### Initialize project

Initialize project using spring initializr

[Initialize project](_docs/java_crud_init.jpg)

### Connect Database

save db url, driverClassName, username, and password in `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=mk
spring.datasource.password=[password]
```

### Connection Check

Insert data into db to check it's connected

1. schema.sql in the dir `resource`

```sql
  DROP TABLE IF EXISTS tbl_borad;
  CREATE TABLE tbl_board(
    board_id LONG auto_increment,
    title varchar(30) NOT NULL,
    content VARCHAR(30) NOT NULL,
    name VARCHAR(30) NOT NULL,
    read INTEGER DEFAULT 0,
    PRIMARY KEY(board_id)
  );

  INSERT INTO tbl_board(title, content, name) VALUES('title1', 'content1', 'name1');
  INSERT INTO tbl_board(title, content, name) VALUES('title2', 'content2', 'name2');
  INSERT INTO tbl_board(title, content, name) VALUES('title3', 'content3', 'name3');
  INSERT INTO tbl_board(title, content, name) VALUES('title4', 'content4', 'name4');
  INSERT INTO tbl_board(title, content, name) VALUES('title5', 'content5', 'name5');
  INSERT INTO tbl_board(title, content, name) VALUES('title6', 'content6', 'name6');
  INSERT INTO tbl_board(title, content, name) VALUES('title7', 'content7', 'name7');
  INSERT INTO tbl_board(title, content, name) VALUES('title8', 'content8', 'name8');

```

### Enable accessing the H2 Console

Add h2 console enabled set true in `application.properties`
```properties
spring.h2.console.enabled=true
```

