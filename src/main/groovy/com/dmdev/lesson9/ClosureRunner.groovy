package com.dmdev.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
//        Function<Integer, Integer> func = value -> value + value
//        def result = func.apply(5)
//        println result
        println "1 =============="
        Closure closure = { value = 78 ->
            println value
            value + value
        }
        println "2 =============="
//        def result2 = closure.call(5)
//        def result3 = closure(5)
        def result3 = closure()
        println "3 =============="
//        println "result2: " + result2
        println "result3: " + result3
        println "4 =============="

        Stream.of(1, 2, 3, 4)
//                .map(value -> value + value)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)
        println "5 =============="
        int x = 10
        check(x > 0) {
            println(++x)
        }
        println x
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
