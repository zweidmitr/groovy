package lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        def file = new File(".gitignore")
        println file.text


        file.each { line -> println(line) }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println(allText)
        }
        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        // Write
        def file2 = new File("text.txt")
        file2.text = "SOmE text "
        file2 << "new line" << System.lineSeparator()
//        file2.withOutputStream {}
//        file2.newOutputStream()

        def srcDir = new File("src")
        srcDir.eachDirRecurse { println it}

        println("============")

        srcDir.eachFileRecurse(FileType.FILES) {println(it)}
    }
}
