package pl.altkom.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("Paweł");
        s1.add("Bogdan");
        s1.add("Paweł");
        s1.add("Bogdan");

        for (String s : s1) {
            System.out.println(s);
        }
    }
}
