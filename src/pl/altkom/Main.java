package pl.altkom;

interface Person {
    default void walk() {
        System.out.println("Idzie osoba");
    }
}

interface Wolf {
    default void walk() {
        System.out.println("Wilk idzie");
    }
}

class Student implements Person {

}

class Werwolf implements Wolf, Person {
    @Override
    public void walk() {
        Wolf.super.walk();
        Person.super.walk();
    }
}


public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.walk();
        Werwolf w = new Werwolf();
        w.walk();
    }
}
