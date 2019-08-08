package linter;

import java.io.*;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args) {
        LinterCheck();
    }

    public static String LinterCheck(){
        String filePath = "./src/main/resources/gates.js";
        try {
//            Scanner s = new Scanner(new File(filePath));
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                
                line = reader.readLine();

            }
            System.out.println("end of file");
        } catch (IOException e) {
            System.out.println("the file was not found");
        }
        return "Hello";
    }
}
