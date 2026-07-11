package codes;

public class SumOfArray {
    static void main(String[] args) {
        int[] dailyTrancations = {10035,32900,23000,34532,42500,65000};

        int sum = 0;

        for(int i =0; i<dailyTrancations.length; i++){
            sum += dailyTrancations[i];

            System.out.println("Today's Total transcations : " + sum);
        }
    }
}
