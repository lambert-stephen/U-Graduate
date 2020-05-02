What I learned through the specialization of the Spring Framework

Concepts: I learned the importance of dependency injection. Spring focuses on inversion of
control and making it as easy as possible for your apps to be decoupled and scalable. When I 
first started this project, I didn't really understand why dependency injection was important
(other than very superficial examples) but after making some mistakes and having to rewrite code
because of hacks I did through laziness, I realized the importance of it all. It really makes 
your code much more readable, scalable, etc. 

- Spring MVC 
    - Spring's most popular functionality is withing Spring MVC. I have learned how to 
    configure the application to connect to a database, utilize a controller to route uris 
    and configure GET,POST,PUT mappings. Configuration of JSP template files was also something 
    I learned
    
    - Spring works well with the Hibernate ORM model. This was 1 of the more complex and in depth thing
    I learned. Learning this also vastly increased my knowledge on mysql data models and the DAO 
    Design pattern. I learned how to map many to many, many to one, one to one, and uni/bi directional
    mappings using java notation. 
    
- Spring Security
    - I learned how to make a design pattern that utilized mysql to authenticate and authorize users
    by creating an application context that read pre-defined user roles. Used a password encoder that 
    encoded passwords into bcrypt which were then saved in the db and decoded them into plain text when 
    received by the application context. Learned how to configure different roles and gave then 
    specific authorizations depending on the uri's
    
- Spring Boot
    - Spring boot is spring's quick and easy way to set up projects and get a web app running. This is
    what was used to power most of the frameworks. Spring boot brought all of the above frameworks together
    and its what actually gets set up when deployment locally or virtually. 