# Reproduction repo for using Lombok, JSR 310 and Liberty
Steps to reproduce are below.

## Build
* build the application with `mvn package`
* deploy it to Liberty (I've used 17.0.0.2)

_or_

Open the project in IntelliJ and run the `Demo app`.

## Test
Next, run `./test.sh` which uses `curl` to fire a request to the app.

## Expectations and Observations
Expected behaviour is a response that says `"Got it!"` - this is what for example WildFly does.

Actual behaviour is a HTTP response `HTTP/1.1 500 Internal Server Error`.

The log file reads:

    Caused by: org.codehaus.jackson.map.JsonMappingException: Can not construct instance of java.time.LocalDate, problem: no suitable creator method found
     at [Source: org.apache.cxf.transport.http.AbstractHTTPDestination$1@46fdafac; line: 1, column: 2]

