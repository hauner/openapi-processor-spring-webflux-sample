# openapi-processor-spring (webflux) sample project
 
This is a simple Spring Boot (gradle) project that is using 
* [openapi-processor-spring][oap-spring] to
generate java interfaces for the api defined in an openapi.yaml file
* [openapi-processor-json][oap-json] to convert the openapi yaml to json format
* [openapi-processor-gradle plugin][oap-gradle] to run both processors

The purpose of the sample is to show the setup of the gradle plugin, and the processors for an
**annotation** based Spring WebFlux application.

# Documentation 

See [here][oap-docs].


[oap-docs]: https://hauner.github.com/openapi-processor/spring-webflux-sample/index.html
[oap-spring]: https://hauner.github.com/openapi-processor/spring/current/index.html
[oap-json]: https://hauner.github.com/openapi-processor/json/current/index.html
[oap-gradle]: https://hauner.github.com/openapi-processor/gradle/current/index.html
