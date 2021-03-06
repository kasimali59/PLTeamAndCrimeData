# Spring application on PL teams and crime data 

## Running PL teams and crime data locally
PL teams and crime data is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). You can build a jar file and run it from the command line:
```
git clone https://github.com/kasimali59/PLTeamAndCrimeData.git
cd PLTeamAndCrimeData
./mvnw package
java -jar target/*.jar
```
### REST API
| Method | Url | Description |
| ------ | --- | ----------- |
| GET    | /stadium?year={year}&month={month} | Get all PL teams data including crime data. Sorted by month and year |

### Request Header
| Header-Name	 | Possible values | Description |
| ------ | --- | ----------- |
| X-Auth-Token | [a-z1-9]+ | Your authentication token |

To get your own authentication token. You need to create an account at https://www.football-data.org/client/register
