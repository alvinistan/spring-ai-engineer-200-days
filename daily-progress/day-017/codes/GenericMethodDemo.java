package codes;

public class GenericMethodDemo {
    public static <T> void print(T value){
        System.out.println(value);
    }

    static void main(String[] args) {
        print("java");
        print(100);
    }
}
