package codes;

import java.util.HashMap;

public class hashMap {
    static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Kani Leenas");
        students.put(102, "Vini Leenas");

        System.out.println(students.get(1));
    }
}
