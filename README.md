# Cinema application
#### This is a RESTful application that supports registration, authentication, authorization and CRUD operations, based on SOLID principles.
## Structure:
#### The project uses a three-level architecture:
| **Controllers** |
|:---------------:|
|        ⇕        |
|  **Services**   |
|        ⇕        |
|     **DAO**     |
#### Endpoints with access
- ALL
    - POST: /register
- USER / ADMIN
    - GET: /cinema-halls
    - GET: /movies
    - GET: /movie-sessions/available
- ADMIN
    - POST: /cinema-halls
    - POST: /movies
    - POST: /movie-sessions
    - PUT: /movie-sessions/{id}
    - DELETE: movie-sessions/{id}
    - GET: /users/by-email
- USER
    - GET: /orders
    - POST: /orders/complete
    - PUT: /shopping-carts/movie-sessions
    - GET: /shopping-carts/by-user
## Technologies:
* Java 17
* Spring 5.3.20
* Spring Security 5.6.10
* Hibernate 5.6.14.Final
* Maven
* MySQL 8.0.22
* Tomcat 9.0.50
## How to run the project:
* clone [this](https://github.com/Serhii-Prykhodko/cinema-app) project,
* install [MySQL](https://dev.mysql.com/downloads/installer/) and create a schema, 
* configure [db.properties](https://github.com/Serhii-Prykhodko/cinema-app/blob/main/src/main/resources/db.properties) with your DRIVER, URL, USERNAME and PASSWORD,
* install and run [Postman](https://www.postman.com/downloads/) for testing,
* install [Tomcat 9.0.50](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/) configure and run,
* the application will create ADMIN and USER

| Role  | login           | password   |
|-------|-----------------|------------|
| ADMIN | admin@gmail.com | admin12345 |
| USER  | user@gmail.com  | user12345  |

## UML diagram:
![](uml.png)
