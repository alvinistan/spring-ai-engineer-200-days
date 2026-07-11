package codes;

public class LargestElement {
    static void main(String[] args) {
        int[] numbers = {22,334,423,546,565,565};

        int largestValue = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largestValue){
                largestValue = numbers[i];
            }
        }
        System.out.println("The largest Value :" + largestValue);
    }
}
