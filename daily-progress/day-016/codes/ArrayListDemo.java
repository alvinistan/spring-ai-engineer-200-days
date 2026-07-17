package codes;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Spring AI");


        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
