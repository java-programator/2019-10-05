package pl.altkom.sets;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // NIE RÓBCIE TAK!!!
    @Override
    public boolean equals(Object o) {
        return ((Person) o).name.equals(name);
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashSetExample2 {
    public static void main(String[] args) {
        Person p1 = new Person("Pawel", 30);
        Person p2 = new Person("Bogdan", 30);
        Person p3 = new Person("Pawel", 33);
        Person p4 = new Person("Bogdan", 33);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("================================");

        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);

        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println(persons.contains(p2));
    }
}
