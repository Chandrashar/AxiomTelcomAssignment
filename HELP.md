# Read Me First
This application basicaly uses Spring Boot Framework with Java 8 with Spring Data JPA.

Spring Data JPA
Jackson for JSON
H2 in memory/File database
JPA Criteria

* The original package name 'com.chan.axiom' .

# This Mobile Application uses provided Json database and load it into H2 Database.
    
    File: /AxiomTelcomAssignment/src/main/resources/mobiledb/mobile_database.json
    
# It exposes services based on the Json file attributtes and query to database.


Db Properties: File: /AxiomTelcomAssignment/src/main/resources/application.properties

Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:file:~/axiomtelcom

Exposed endpoints:

GET http://localhost:8080/mobile/search?priceEur=200
GET http://localhost:8080/mobile/search?phone=CDMA
GET http://localhost:8080/mobile/search?sim=SIM
GET http://localhost:8080/mobile/search?sim=eSim
GET http://localhost:8080/mobile/search?announceDate=1999&priceEur=200



