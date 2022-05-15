package lesson17

class OopRunner {
    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName
        println student.firstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName // not recommended

        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18, id: 222)
        println student1
        println "============"
        student1.properties.each { println(it) }
        println "============"

        Student student2 = ['Sveta', 'Svetikova', 30]
        Student student3 = ['Sveta', 'Svetikova']
        println(student2)
        println(student3)

        println()
        def (fn, ln) = student2
        println fn
        println ln

        assert [student1, student2].collect { it.firstName } == ["Petr", "Sveta"]
        assert [student1, student2]*.firstName == ["Petr", "Sveta"]
        println()

        String.mixin(OopRunner.class)
        "Ivan".printStr()
    }

    static def printStr(String self) {
        println "It's mixin $self"

    }
}
