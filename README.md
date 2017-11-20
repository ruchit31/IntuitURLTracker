# IntuitURLTracker

The application provides 2 functionalities

1] Counts the No of times the URL's has visited.
2] Top 3 URL's that have been visited at any given point of time.

I have developed this Appliction using Spring Boot

This is the flow in our application


<img width="832" alt="screen shot 2017-11-20 at 1 20 32 am" src="https://user-images.githubusercontent.com/11257521/33010980-547ac19a-cd91-11e7-9d9b-31a04e10dabf.png">

User--> represents the client or browser, which generates HTTP request
Controller --> HTTP request is mapped to a specific controller and it calls service layer
Service --> Service layer has some business logic in it and it calls Repository Layer
Repository --> Repositiory layer talks to Database and is reponsible for data manipulation, writing JDBC queries


I have used JDBC Template which provides API for Java Application to get connected to database 



