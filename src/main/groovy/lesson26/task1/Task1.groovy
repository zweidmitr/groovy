package lesson26.task1

import lesson17.Student

/**
 * добавить метод инициализации "make" для создания любых классовю
 * метод должен проксировать вызов на соответствующий конструктор
 *
 * изменение поведения для выполнения всех-всех классов
 */
class Task1 {
    static void main(String[] args) {
//        new HashSet<>([1, 2, 3, 4])

        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate

            delegate.metaClass.invokeConstructor(values)
        }


        def hashSet = HashSet.make([1, 2, 3, 4])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()

        println hashSet
        println student
        println student2
    }
}
