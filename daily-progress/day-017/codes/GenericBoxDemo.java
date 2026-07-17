package codes;

public class GenericBoxDemo {
    static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.setValue("Spring AI");
        String val = box.getValue();
        System.out.println(val);

        GenericBox<Integer> num = new GenericBox<>();
        num.setValue(129);
        System.out.println(num.getValue());
    }
}
