Microservices example

The example covers setting up :
-Centralised Microservice Configuration with Spring Cloud Config Server
-Implementation of client side load balancing (Ribbon), Dynamic scaling(Eureka Naming Server) and an API Gateway (Zuul)
-Implementation of Distributed tracing for microservices with Spring Cloud Sleuth and Zipkin
-Implementation example of Fault Tolerance for microservices with Zipkin

Contains a group of microservices.   <br>

Spring config server  http://localhost:8888/limits-service/default  <br>
limit-service    -   http://localhost:8080/limits                    <br>

testing tools   - java -jar restclient-ui-3.1-jar-with-dependencies.jar  <br>


 
