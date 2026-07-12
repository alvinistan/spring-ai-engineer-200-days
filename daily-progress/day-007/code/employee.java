package code;

public class employee {

    int id;

    String name;

    double salary;

    void display(int id , String name, double salary){

        System.out.println("ID : " + id);

        System.out.println("Name : " + name);

        System.out.println("Salary : " + salary);

    }

    void display(){

        System.out.println("ID : " + id);

        System.out.println("Name : " + name);

        System.out.println("Salary : " + salary);

    }
    static void main(String[] args) {

        employee ep1 = new employee();
        ep1.display(100,"kani Leenas", 120000.00);

        employee ep2 = new employee();
        ep2.id = 102;
        ep2.name = "Vini Leenas";
        ep2.salary = 110000;

        ep2.display();


    }
}
