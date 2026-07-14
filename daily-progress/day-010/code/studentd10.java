package code;

import java.time.LocalDateTime;

public class studentd10 extends person{
    studentd10(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();

        System.out.println("student Details...");
    }

    static void main(String[] args) {
        studentd10 st = new studentd10("Vini");
        st.display();
    }
}
