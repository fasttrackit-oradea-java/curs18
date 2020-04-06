package ro.fasttrackit.curs18.generic;

public class Person implements Displayable {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String display() {
        return "My name is " + name;
    }
}
