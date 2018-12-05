package io.articulus.fhir.generator


open class FhirRenderer(val spec: FhirSpec) {
    fun build() {
        FhirStructureDefinitionRenderer(spec).render()
        TestClassRenderer(spec)
    }
}


