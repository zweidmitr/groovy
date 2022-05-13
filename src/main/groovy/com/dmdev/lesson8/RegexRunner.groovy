package com.dmdev.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
        String regex = "(\\w+) (\\d+)"
        String regexGroovy = /(\w+) (\d+)/

//        Pattern pattern = Pattern.compile(regexGroovy)
        Pattern pattern = ~regexGroovy

//        Matcher matcher = pattern.matcher(value)
        Matcher matcher = value =~ regexGroovy

//        boolean result = matcher.matches()
        boolean result = value ==~ regexGroovy

        // OR
//        while (matcher.find()) {
//            println matcher.group(1)
//            println matcher.group(2)
//            println matcher.group()
//            println(/========/)
//        }
        println(/========/)

        println matcher[0]
        println matcher[1]
        println matcher[2]

        println matcher[1][2] // 22
        println matcher[0..2]
        println(/========/)


        matcher.each { group -> println(group) }
        println(/========/)

        matcher.each { group, group1, group2 ->
            {
                println(group)
                println(group1)
                println(group2)
                println "<----->"
            }
        }
    }
}

