package com.dmdev.lesson10

class ConditionRunner {
    static void main(String[] args) {
        int x =10

        boolean booleanResult = x > 0
        if (x) {
            println(x)
        }

        def person = new Person(17)
        if (person) {
            println person.getId()
        }

//        if(person!= null) {
//            person.getId()
//        }

        if(person?.getId()){
            println "if"
        }

        def result = x ?: 1
        println result
    }
}
