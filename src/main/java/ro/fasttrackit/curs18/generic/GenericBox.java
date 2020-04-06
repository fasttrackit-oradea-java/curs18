package ro.fasttrackit.curs18.generic;

public class GenericBox<T> {
    private final T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
