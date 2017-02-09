# SpringMVCHibernateSpringSecurity
Spring MVC 4 + Spring Security 4 + Hibernate

This application use Spring MVC secured using Spring Security, integrating with MySQL database using Hibernate, handling Many-to-Many relationship on view, storing passwords in encrypted format using BCrypt, and providing RememberMe functionality using custom PersistentTokenRepository implementation with Hibernate HibernateTokenRepositoryImpl, retrieving the records from database and updating or deleting them within transaction, all using annotation configuration.

The project shows a simple user-management application. One can create a new user, edit or delete an existing user, and list all the users. User can be associated with one or more UserProfile, showing many-to-many relationship. URL’s of the applications are secured using Spring Security. 

Technologies being used:
* Spring 4.3.6.RELEASE
* Spring Security 4.2.1.RELEASE
* Hibernate Core 5.1.3.Final
* validation-api 1.1.0.Final
* hibernate-validator 5.4.0.Final
* MySQL Server 5.7
* Maven 3
* JDK 1.8
* Tomcat 8.5
* Eclipse NEON.2
* logback 1.1.10
