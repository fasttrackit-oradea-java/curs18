package ro.fasttrackit.curs18.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("salut");
        System.out.println(stringOptional.get());

        Optional<String> emptyOptional = Optional.ofNullable(null);
        if (emptyOptional.isPresent()) {
            System.out.println(emptyOptional.get());
        } else {
            System.out.println("is empty");
        }

        String value = emptyOptional.orElse("altceva");
        System.out.println(value);

        emptyOptional = Optional.of("ceva");
        value = emptyOptional.orElse("altceva");
        System.out.println(value);

        Optional<String> result = find("nu");
        String message = result.orElse("nu am gasit");
        System.out.println(message);

        System.out.println(find("da").orElse("nu am gasit"));
    }

    public static Optional<String> find(String name) {
        if ("da".equalsIgnoreCase(name)) {
            return Optional.of("gasit");
        } else {
            return Optional.empty();
        }
    }
}
