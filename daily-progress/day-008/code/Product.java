package code;

public class Product {

    int id;
    String name;
    double price;

    Product(){

    }

    Product(int id,String name){

        this.id=id;
        this.name=name;

    }

    Product(int id,String name,double price){

        this.id=id;
        this.name=name;
        this.price=price;

    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
    }

}
