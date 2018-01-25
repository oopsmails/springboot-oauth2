# springboot-oauth2

####################################################################################


EngineServer1

jdbc:hsqldb:hsql://localhost/



curl -X POST --user 'fooClientIdPassword:secret' -d 'grant_type=password&username=tom&password=111' http://localhost:8080/spring-security-oauth-server/oauth/token

curl -i -H "Accept: application/json" -X GET http://localhost:8080/spring-security-oauth-server/tokens/fooClientIdPassword

curl -i -H "Accept: application/json" -H "Authorization: Bearer e8b21485-a31e-4d13-82cb-e20d3a7ceab7" -X GET http://localhost:8082/springbootoauth2-resource/foos/1


####################################################################################

http://localhost:18082/ui1

john123

seeing: http://localhost:18082/ui1/securedPage


http://localhost:18083/ui2/securedPage

http://localhost:18081/auth/login


==========================================

templatehsqldb:

A project using in memory hsqldb.
Test Springboot data jpa.

1. Run SpringBootDataBaseApplication
2. Run Postman, import InMemDbTest.postman_collection.json


