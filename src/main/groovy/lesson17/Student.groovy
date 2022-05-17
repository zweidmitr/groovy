package lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

import javax.sound.sampled.Mixer

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Canonical
//@Immutable
@Builder
//@Slf4j
//@Mixin(WithId.class)
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    static void main(String[] args) {
//        Student.builder()
//        .lastName("Ivanov")
//        .firstName("Ivan")
//        .build()
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def fiesd = name - 'findBy'
        def fieldValue = this."$field"
        println "select from Student where $field = $fieldValue"
    }

    def propertyMissing(String name) {
        println "missing property: $name"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate
            Closure second = {
                println thisObject // == this
                println owner // те рамки где опредилили наш closure
                println delegate // == owner
            } // declaration
            second() // execution
        }
        closure
    }
}
