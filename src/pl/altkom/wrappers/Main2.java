package pl.altkom.wrappers;

class IntStack {
    int array[];
    int max_size;
    int actual_size;

    public IntStack(int m) {
        max_size = m;
        actual_size = 0;
        array = new int[max_size];
    }

    public void push(int a) {
        array[actual_size] = a;
        actual_size++;
    }

    public int pop() {
        int res = array[actual_size-1];
        actual_size--;
        return res;
    }

    public boolean isEmpty() {
        return actual_size == 0;
    }

    public boolean isFull() {
        return actual_size == max_size;
    }
}

class StringStack {
    String array[];
    int max_size;
    int actual_size;

    public StringStack(int m) {
        max_size = m;
        actual_size = 0;
        array = new String[max_size];
    }

    public void push(String a) {
        array[actual_size] = a;
        actual_size++;
    }

    public String pop() {
        String res = array[actual_size-1];
        actual_size--;
        return res;
    }

    public boolean isEmpty() {
        return actual_size == 0;
    }

    public boolean isFull() {
        return actual_size == max_size;
    }
}

class Stack<T> {
    T array[];
    int max_size;
    int actual_size;

    public Stack(T[] array) {
        max_size = array.length;
        actual_size = 0;
        this.array = array;
    }

    public void push(T a) {
        array[actual_size] = a;
        actual_size++;
    }

    public T pop() {
        T res = array[actual_size-1];
        actual_size--;
        return res;
    }

    public boolean isEmpty() {
        return actual_size == 0;
    }

    public boolean isFull() {
        return actual_size == max_size;
    }
}


public class Main2 {



    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(new Integer[10]);
        Stack<String> stringStack = new Stack<>(new String[10]);
    }
}
