package groovy.com.dmdev.lesson5

import groovy.transform.CompileStatic

@CompileStatic
class VariablesRunner {
    static void main(String[] args) {
        int valueZero = 5
        Integer value =5
        BigInteger value2 = 26G
        BigDecimal value3 = 3.3G
        new Date()
        def value33  = 5
    }
}
