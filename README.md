Microservices example

The example covers setting up :
<ul>
  <li>Centralised Microservice Configuration with Spring Cloud Config Server</li>
  <li>Client side load balancing (Ribbon)<li> Dynamic scaling(Eureka Naming Server) </li> 
  <li>All accessed through an API Gateway (Zuul)</li>
  <li>Implementation of Distributed tracing for microservices with Spring Cloud Sleuth and Zipkin</li>
 <li>Implementation example of Fault Tolerance for microservices with Zipkin,</li>
</ul>


Contains a group of microservices. This example focusus more on the config server , naming server ,API gateway, distrbuted tracing etc and fault tollerance.


Spring config server  http://localhost:8888/limits-service/default  <br>
limit-service    -   http://localhost:8080/limits                    <br>
testing tools   - java -jar restclient-ui-3.1-jar-with-dependencies.jar  <br>


 <table>
<thead>
<tr>
<th>Application</th>
<th>Port</th>
</tr>
</thead>
<tbody>
<tr>
<td>Service C</td>
<td>8080, 8081, ...</td>
</tr>
<tr>
<td>Spring Cloud Config Server</td>
<td>8888</td>
</tr>
<tr>
<td></td>
<td></td>
</tr>
<tr>
<td>Service B</td>
<td>8000, 8001, 8002, ..</td>
</tr>
<tr>
<td>Service A</td>
<td>8100, 8101, 8102, ...</td>
</tr>
<tr>
<td>Netflix Eureka Naming Server</td>
<td>8761</td>
</tr>
<tr>
<td>Netflix Zuul API Gateway Server</td>
<td>8765</td>
</tr>
<tr>
<td>Zipkin Distributed Tracing Server</td>
<td>9411</td>
</tr>
</tbody>
</table>
