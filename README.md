[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Alejo311548_consulta&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Alejo311548_consulta)

Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies
### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
