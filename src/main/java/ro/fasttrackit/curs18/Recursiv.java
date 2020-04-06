package ro.fasttrackit.curs18;

public class Recursiv {
    public int length(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }
}
