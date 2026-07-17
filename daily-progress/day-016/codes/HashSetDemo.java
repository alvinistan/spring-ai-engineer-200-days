package codes;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Spring");
        languages.add("Java");
        languages.add("apple");

        System.out.println(languages);

    }
}
