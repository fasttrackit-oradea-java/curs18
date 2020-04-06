package ro.fasttrackit.curs18.optional;

import java.util.List;
import java.util.Optional;

public class PersonMain {
    public static void main(String[] args) {
        var service = new PersonService(
                List.of(
                        new Person("Maria", 30),
                        new Person("Lotzi", 19),
                        new Person("Gicu", 33),
                        new Person("Horea", 25)
                )
        );

        final Optional<Person> byAge = service.getByAge(55);
        if (byAge.isPresent()) {
            System.out.println(byAge.get());
        } else {
            System.out.println("No person of 55 years");
        }

        final Optional<Person> person = service.getByName("Gicu");
        if (person.isPresent()) {
            System.out.println(person.get());
        } else {
            System.out.println("No person Gicu");
        }

        final Person multePretentii = service.getByName("George")
                .orElse(service.getByName("Misu")
                        .orElse(service.getByAge(30)
                                .orElse(null)));
        System.out.println(multePretentii);


        final Person not = service.getByName("Not")
                .orElseThrow();
    }
}
