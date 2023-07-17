# Firm Ranking Service

A simple spring-boot application to list and query the firm rankings.

## Prerequisite
1. Java 17
2. Maven

## Run
 ```text
 mvn spring-boot:run
 ```

## Usage

```text
curl -i -H "Accept: application/json" -H "token: {token}" -H "Content-Type: application/json" http://localhost:8080/firmranking?regionId={regionId}
```
 where  token is the oAuth tokenId, eg: "12sds3434", only support regionId 170 at the moment. It return http 400 error if the regionId is not 170.

# Features
1. Rest API to get the list of Firms based on Rankings and grouped by region.
2. Security based on TokenId

##  Roadmap.
1. Ability to paginate the firm ranking results based on offset and page.
2. Filter and query the results based on Badge and firm name.
3. Add support for more regions.

## Technical improvements.
1. Read the firm rankings from a database and cache the rankings based on region.
2. Add the ability to run the application in docker containers in a cloud environment. eg Amazon EKS.
3. Extend the security to use Spring Oauth based authentication and use an Identity server to validate the token.
4. Add support for CI pipeline to be able to build and deploy the application using github actions.
5. Add a maven swagger plugin to generate the api documentation.
6. Improve test coverage with separate unit and Integration tests.
7.  Make the regionId configurable in application.properties so that it can be easily extended and avoid the need of hardcoding.
8. Add a logging framework like log4j.
9. Add application metrics so that it could be monitored for performance optimisations.

### Notes
1. It was decided to use Java for the service as it performs well and enjoys good third party support. 
2. Spring boot is good framework for API development because it helps to avoid a lot of boilerplate code.
3. Other options would be to use Micronaut which is a good alternative if we need to migrate to GraalVm in future.



 

