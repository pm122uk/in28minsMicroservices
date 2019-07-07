Microservices example

The example covers setting up :
<ul>
  <li>Centralised Microservice Configuration with Spring Cloud Config Server</li>
  <li>Implementation of client side load balancing (Ribbon), Dynamic scaling(Eureka Naming Server) and an API Gateway (Zuul)</li>
  <li>Implementation of Distributed tracing for microservices with Spring Cloud Sleuth and Zipkin</li>
 <li>Implementation example of Fault Tolerance for microservices with Zipkin,<li>
</ul>


Contains a group of microservices.   <br>

Spring config server  http://localhost:8888/limits-service/default  <br>
limit-service    -   http://localhost:8080/limits                    <br>
testing tools   - java -jar restclient-ui-3.1-jar-with-dependencies.jar  <br>


 
