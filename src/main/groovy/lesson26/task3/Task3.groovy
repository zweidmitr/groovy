package lesson26.task3

class Task3 {
    static void main(String[] args) {
        // given(Closure{}).when(Closure{}).then(Closure{})

        given {
            a = 2 // map.a = 2 // propertyMissing -> map.get("a, 2)
            b = 4
        } when {
            result = a + b
        } then {
            result == 6
        }
    }

    static def given(Closure closure) {
        def valueHolder = [:]
        closure.delegate = valueHolder
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure() // execution
        ["when": { Closure whenClosure ->
            {
                whenClosure.delegate = valueHolder
                whenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                whenClosure() // execution
                ["then": { Closure thenClosure ->
                    {
                        thenClosure.delegate = valueHolder
                        thenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                        assert thenClosure() // execution
                    }
                }]
            }

        }]
    }
}
