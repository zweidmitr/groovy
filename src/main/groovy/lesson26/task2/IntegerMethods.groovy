package lesson26.task2

@Category(Integer)
class IntegerMethods {
    def getMm() {
        this
    }

    def getCm() {
        this * 10
    }

    def getM() {
        getCm() * 100
    }
}
