package lesson24

import lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethod.class) {
            student.testStr
        }
        student.testStr

    }
}
