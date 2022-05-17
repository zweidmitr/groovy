package lesson26.task2
/**
 * Добавить возможност складывать различные единицы измерения.
 * например 3.см + 1.м -25.мм = 1005 (мм)
 */
class Task2 {
    static void main(String[] args) {

        Integer.metaClass {
            getMm = {
                delegate
            }

            getCm = {
                delegate * 10
            }

            getM = {
                delegate.cm * 100
            }
        }

        def result = 3.cm + 1.m - 25.mm
        assert result == 1005

    }

    private static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}
