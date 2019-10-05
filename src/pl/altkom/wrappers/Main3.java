package pl.altkom.wrappers;

class IntIntPair {
    int first;
    int last;

    public IntIntPair(int first, int last) {
        this.first = first;
        this.last = last;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }
}

class StringStringPair {
    String first;
    String last;

    public StringStringPair(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}

class IntStringPair {
    int first;
    String last;

    public IntStringPair(int first, String last) {
        this.first = first;
        this.last = last;
    }

    public int getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}

class Pair<okon, W> {
    okon first;
    W last;

    public Pair(okon first, W last) {
        this.first = first;
        this.last = last;
    }

    public okon getFirst() {
        return first;
    }

    public W getLast() {
        return last;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Pair<Integer, String> intStringPair = new Pair<>(1, "Paweł");
        Pair<String, Integer> stringIntPair = new Pair<>("Bogdan", 2);
        Pair<Double, Integer> doubleIntPair = new Pair<>(4.5, 5);
    }
}
