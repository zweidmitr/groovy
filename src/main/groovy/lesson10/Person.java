package lesson10;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    public boolean aBoolean() {
        return id > 10;
    }

    public Integer getId() {
        return id;
    }
}
