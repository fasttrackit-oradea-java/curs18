package ro.fasttrackit.curs18.generic;

import ro.fasttrackit.curs18.Recursiv;

public class Main {
    public static void main(String[] args) {
        simpleBox();
        genericBox();
        displayBox();
    }

    private static void displayBox() {
        DisplayBox<Person> boxCuPerson = new DisplayBox<>(new Person("Maria"));
        DisplayBox<Laptop> laptopDisplayBox = new DisplayBox<>(new Laptop());

        System.out.println(boxCuPerson.displayItem());
        System.out.println(laptopDisplayBox.displayItem());


    }

    private static void genericBox() {
        GenericBox<String> boxCuString = new GenericBox<>("itemu");
        GenericBox<Integer> boxCuInteger = new GenericBox<>(1);
        GenericBox<Recursiv> boxCuRecursiv = new GenericBox<>(new Recursiv());

        String stringDinBox = boxCuString.getItem();
        Integer intregDinBox = boxCuInteger.getItem();
        Recursiv recursivDinBox = boxCuRecursiv.getItem();

        System.out.println(stringDinBox);
        System.out.println(intregDinBox);
        System.out.println(recursivDinBox);
    }

    private static void simpleBox() {
        var boxCuString = new Box("salut");
        var boxCuIntreg = new Box(new Integer(1));
        var boxCuRecursiv = new Box(new Recursiv());

        Object stringDinBox = boxCuString.getItem();
        Object intregDinBox = boxCuIntreg.getItem();
        Object recursivDinBox = boxCuRecursiv.getItem();

        System.out.println(stringDinBox);
        System.out.println(intregDinBox);
        System.out.println(recursivDinBox);
    }
}
