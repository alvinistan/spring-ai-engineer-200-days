package codes;

public class SmallestElement {
    static void main(String[] args) {
        int[] numbers = {13,34,53,64,12,41,13,31,123};

        int smallestVal = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallestVal){
                smallestVal = numbers[i];
            }
        }
        System.out.println("The smallest value is :" + smallestVal);
    }
}
