package code;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", 45000),
                new Employee("John", 60000),
                new Employee("Nimal", 75000),
                new Employee("Kamal", 78000)
        );

        employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .forEach(employee ->
                        System.out.println(employee.getName())
                );
    }
}