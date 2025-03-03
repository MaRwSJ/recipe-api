Springboot API that uses GraphQL to create and update the postgres Database that stores Recipes

<h1> Recipe API (JAva SpingBoot + GraphQL) </h1>

<h2> Overview:</h2>
This Recipe API is a backend service build with Spring Boot and GraphQL that allows users to:
    **GET**
    **CREATE**
    **UPDATE** 
    **DELETE** 
    Recipes along with their ingredients. 


**Goal:** 

- To build a Recipe API database using gtaphql in order to gain knowledge with building 
Java springboot and GraphQL. 

- Build a real world backend application with postgreSQL.

- Design a Database and create it in postgrSQL.

- Understand REST vs GraphQL API Design

** note: this project is a work in progress as I am using it to learn about REST and GraphQL using Spring Boot. **


<h2> Tech Stack:</h2>

- Spring Boot 3.4.2
- GraphqL + Codegen (for API Schema)
- PostgreSQL (Database)
- InjelliJ IDEA (IDE for development)
- Maven (dependency management)


## <h2> Database Design: PostgreSQL </h2>

this application will consist of 2 tables in my database:

** Recipe Table **
**Recipe**
    - id (UUID) - Primary Key
    - name (String)
    - description (String)
    - instructions (Text)
    - ingredients (One-to-Many Relationship)


** Ingredient Table **
**Ingredient**
    - id (UUID) - Primary Key
    - name (String)
    - quantity (String)
    - recipe_id (Foreign Key)


## <h2> Steps Taken For Setup:</h2>

**1. Created a new Spring Boot project using Spring Initalizer website and added my dependencies:**
- Spring Boot Web
- SpringBoot GraphQL
- GraphQL codegen
- PostgreSQL Driver

**2. Added an application.yaml file for connecting to the postgreSQL database:**
- Before this I went into postgres and opened a database and created the tables with the columns i wanted. I used my credentials in the application.yaml file located: src/main/java.com.example.Recipe_api/resources folder. 


**3. Created Recipe Controller in /src/main/java/com/example/Recipe_api/controller folder**
- Added a simple endpoint that returns "API is working" to test the endpoint


**4. Created the models for Recipe and Ingredient - /src/main/java/com/example/Recipe_api/model folder**
- Defined the eneity models - these are  the java data version of the tables created in postgres. 

**5. Created the repositories for these - /src/main/java/com/example/Recipe_api/repository folder**
- Created a repository for Recipe and Ingreidents as this repository will internact with the database. 

**5. RecipeApiApplication.java: entry point into the Spring Boot App**
- located /src/main/java/com/example/Recipe_api/RecipeApiApplication.java - this is the main method for this whole app  

<h2> Next Steps: To implement </h2>

## Create GraphQL schema 

## Implement a simple query for fetching ingredients 

## Implment a simple mutation so you can add, update or delete a recipe from the database 

## Add additonal api endpoints to familarize with REST api 

## Write Unit tests to test each part of my code 