
# Kotlin FHIR Model Generator

Builds a FHIR data model in Kotlin

Building:

    mvn compile
    downloadFiles=true mvn exec:java # downloads files from FHIR
    mvn test



###Todo
* Implement primitive _ support.  https://www.hl7.org/fhir/json.html#primitive
* Add DSTU2

Based on https://github.com/smart-on-fhir/fhir-parser
