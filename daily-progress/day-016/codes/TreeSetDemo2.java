package codes;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1004);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(10000);
        numbers.add(100000);

        System.out.println(numbers);
    }
}
