package lesson25

import lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        println closure.thisObject // main
        println closure.owner // main ->
        println closure.delegate // = owner
        def student = new Student("Ivan", "Ivanov", 29)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        student.with closure
        println student

        student.getInfo()()
    }
}
