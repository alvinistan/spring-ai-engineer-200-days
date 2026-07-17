package codes;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");

        courses.add("Spring Boot");

        // courses.add(100); ❌ Compile-time Error

        System.out.println(courses);

    }
}
//Advantages of Generics
//Type Safety
//Compile-time Error Checking
//No Explicit Casting
//Reusable Code
//Better Readability