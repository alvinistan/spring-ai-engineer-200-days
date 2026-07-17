package codes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Chennai");
        cities.add("Hyderabad");
        System.out.println(cities);

        for(String name : cities){
            System.out.println(name);
        }

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
