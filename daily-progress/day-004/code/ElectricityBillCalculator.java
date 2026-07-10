package code;

import java.util.Scanner;

public class ElectricityBillCalculator {

//    7. Electricity Bill Calculator

//    Rates:
//    First 100 units: Rs. 20 per unit
//    Next 100 units: Rs. 30 per unit
//    Above 200 units: Rs. 50 per unit

 public static double calculateBill(int units) {
     double bill;

     if (units <= 100) {
         bill = units * 20;
     } else if (units <=200) {
         bill = (100 * 20) + ((units- 100) * 30);
     } else {
         bill = (100 * 20) + (100 * 30) + ((units - 200) * 50);
     }
     return bill;
 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = scanner.nextInt();

        if(units < 0){
            System.out.println("Units Cannot be negative...");
        } else {
            double bill = calculateBill(units);
            System.out.println("Electricity Bill = Rs."+ bill);
        }
        scanner.close();

    }


}
