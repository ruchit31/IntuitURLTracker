# IntuitURLTracker

The application provides 2 functionalities

1] Counts the No of times the URL's has visited.
2] Top 3 URL's that have been visited at any given point of time.

I have developed this Appliction using Spring Boot

This is the flow in our application

User-->Controller-->Service-->Repository-->MySQL

User--> represents the client or browser, which generates HTTP request
Controller --> HTTP request is mapped to a specific controller and it calls service layer
Service --> Service layer has some business logic in it and it calls Repository Layer
Repository --> Repositiory layer talks to Database and is reponsible for data manipulation, writing JDBC queries


I have used JDBC Template which provides API for Java Application to get connected to database 



