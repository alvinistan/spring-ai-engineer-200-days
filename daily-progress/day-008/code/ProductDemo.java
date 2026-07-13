package code;

public class ProductDemo {
    static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(103,"HP Laptop");
        Product p3 = new Product(104, "Apple Laptop", 360000);

        p1.display();
        p2.display();
        p3.display();
    }
}
