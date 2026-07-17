package code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReader {

    public static void main(String[] args)throws Exception{

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("employees.txt"));

        writer.write("Alice");

        writer.newLine();

        writer.write("Bob");

        writer.close();

    }

}
