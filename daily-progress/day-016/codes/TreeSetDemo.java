package codes;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1004);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(10000);
        numbers.add(100000);

        System.out.println(numbers);
    }
}
