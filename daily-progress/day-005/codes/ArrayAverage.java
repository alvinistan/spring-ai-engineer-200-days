package codes;

public class ArrayAverage {
    static void main(String[] args) {
        int[] todaySales = {2350,3490,2560,5600,7800};
        int sum = 0;

        for (int i = 0; i < todaySales.length; i++) {
            sum += todaySales[i];
        }

        double findAverage = (double)sum /todaySales.length;
        System.out.println("Today Sales Average Value: "+ findAverage);
        System.out.println("Total Transcation :" +sum);
        System.out.println("Number of Transcations :" + todaySales.length);
    }
}


