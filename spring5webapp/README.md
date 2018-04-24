# Spring5webap Lab

## Commands

Command | Description
--------|-------------
`./mvnw spring-boot:run` | Build project and install dependencies from maven wrapper

## Observations
- The h2 database can be accessed through `localhost:<port>/h2-console`. And the JDBC to be used in order to use the in-memory db is `jdbc:h2:mem:testdb`;