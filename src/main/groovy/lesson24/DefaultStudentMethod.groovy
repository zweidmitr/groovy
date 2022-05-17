package lesson24

import lesson17.Student

@Category(Student)
class DefaultStudentMethod {

    def testStr() {
        println "$age, $firstName"
    }
}
