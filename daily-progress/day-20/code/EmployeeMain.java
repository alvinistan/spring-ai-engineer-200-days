package code;

public class EmployeeMain {
    static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ravi", 45000),
                new Employee("John", 60000),
                new Employee("Nimal", 75000),
                new Employee("kamal", 78000)
        };

        for (Employee employee : employees) {
            if (employee.getSalary() > 50000){
                System.out.println(employee.getName());
            }
        }
    }
}
