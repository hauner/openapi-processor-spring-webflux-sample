# openapi-processor-spring (webflux) sample project
 
This is a simple Spring Boot (gradle) project that is using 
* [openapi-processor-spring][oap-spring] to
generate java interfaces for the api defined in an openapi.yaml file
* [openapi-processor-json][oap-json] to convert the openapi yaml to json format
* [openapi-processor-gradle plugin][oap-gradle] to run both processors

The purpose of the sample is to show the setup of the gradle plugin, and the processors for an
**annotation** based Spring WebFlux application.

# documentation 

See [here][oap-docs].


[oap-docs]: https://docs.openapiprocessor.io/spring-webflux-sample
[oap-spring]: https://docs.openapiprocessor.io/spring
[oap-json]: https://docs.openapiprocessor.io/json
[oap-gradle]: https://docs.openapiprocessor.io/gradle
