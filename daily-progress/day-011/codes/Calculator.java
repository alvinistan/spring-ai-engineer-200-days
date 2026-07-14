package codes;

public class Calculator {

    int add(int a,int b){

        return a+b;

    }

    int add(int a,int b,int c){

        return a+b+c;

    }

    double add(double a,double b){

        return a+b;

    }

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,20));

        System.out.println(calculator.add(10,20,30));

        System.out.println(calculator.add(5.5,6.5));

    }

}
