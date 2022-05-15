package lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

import javax.sound.sampled.Mixer

@ToString
@TupleConstructor
//@Mixin(WithId.class)
class Student implements WithId{
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }
}
