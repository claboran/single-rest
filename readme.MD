# Show Case: Spring Boot 3 + Kotlin + JPA + Flyway + Testcontainers

<div style=" width: 100%;">
    <div style="display: flex; width: 100%; justify-content: space-between">
        <div>
            <img src="https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen" alt="Spring Boot 3.1.2">
        </div>
        <div>
            <img src="https://img.shields.io/badge/Kotlin-1.8.22-brightgreen" alt="Kotlin 1.8.22">
        </div>
        <div>
            <img src="https://img.shields.io/badge/Java-17-brightgreen" alt="Java 17">
        </div>
        <div>
            <img src="https://img.shields.io/badge/Flyway9.16.3-brightgreen" alt="Flyway 9.16.3">
        </div>
        <div>
            <img src="https://img.shields.io/badge/Testcontainers-1.18.3-brightgreen" alt="Testcontainers 1.18.3">
        </div>
        <div>
            <img src="https://img.shields.io/badge/PostgreSQL-14-brightgreen" alt="PostgreSQL 14">
        </div>
    </div>
</div>

## What is this project about

This project is a showcase for a Spring Boot 3 application written in Kotlin. It uses JPA to access a PostgreSQL database. The database is managed by Flyway. The tests are using Testcontainers to spin up a PostgreSQL database.
Flyway is used to manage the database migrations for tests and the application

## Current state
    [x] Initial project setup
    [x] Add Flyway
    [x] Add Testcontainers
    [x] Add JPA
    [x] Add a simple entity
    [x] Add a simple repository
    [x] Fly Data Fixtures for tests

## To be continued
    [ ] Build a full Rest API

## Database migration

Database migrations are managed by Flyway. The migrations are located in the `src/main/resources/db/migration` folder.
To seed the database with test data, the migrations are located in the `src/test/resources/db/data` folder.
These migrations are only executed when running the tests.
```properties
spring.flyway.locations=classpath:db/migration, classpath:db/data
```