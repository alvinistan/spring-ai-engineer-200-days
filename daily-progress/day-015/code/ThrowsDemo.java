package code;

import java.io.IOException;

public class ThrowsDemo {

    public static void readFile() throws IOException {
        throw new IOException("File Not Found....");
    }

    static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
