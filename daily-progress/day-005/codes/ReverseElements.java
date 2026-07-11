package codes;

public class ReverseElements {
    static void main(String[] args) {
        int[] numbers = {12,33,34,53,56,64,23};
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.print( numbers[i] + " ");
        }
    }
}
