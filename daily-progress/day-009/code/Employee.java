package code;

public class Employee {
    private int id;

    private String name;

    private double salary;

    public void setSalary(double salary){

        if(salary >= 0){

            this.salary = salary;

        }else{

            System.out.println("Invalid Salary");

        }

    }

    public double getSalary(){

        return salary;

    }

}
