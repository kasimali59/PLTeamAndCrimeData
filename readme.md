# Spring PL teams and crime data Technical Task Application

## Running PL teams and crime data locally
PL teams and crime data is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). You can build a jar file and run it from the command line (it should work just as well with Java 8, 11 or 17):
```
git clone https://github.com/kasimali59/PLTeamAndCrimeData.git
cd PLTeamAndCrimeData
./mvnw package
java -jar target/*.jar
```
| Method | Url | Description |
| ------ | --- | ----------- |
| GET    | /stadium?year={year}&month={month} | Get all PL teams data including crime data. Sorted by month and year |
