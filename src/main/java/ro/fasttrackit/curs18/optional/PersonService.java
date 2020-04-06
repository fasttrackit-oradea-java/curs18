package ro.fasttrackit.curs18.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {
    private final List<Person> persons;

    public PersonService(List<Person> persons) {
        if (persons == null) {
            this.persons = new ArrayList<>();
        } else {
            this.persons = new ArrayList<>(persons);
        }
    }

    public Optional<Person> getByName(String name) {
        for (Person person : persons) {
            if (name.equalsIgnoreCase(person.getName())) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> getByAge(int age) {
        for (Person person : persons) {
            if (age == person.getAge()) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
