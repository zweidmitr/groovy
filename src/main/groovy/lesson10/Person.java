package lesson10;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    public boolean aBoolean() {
        return id > 10;
    }

    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase: " + switchValue);
        return false;
    }

    public Integer getId() {
        return id;
    }
}
