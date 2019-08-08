package linter;

import java.io.*;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args) {
        LinterCheck();
    }

    public static String LinterCheck(){
        String filePath = "./src/main/resources/gates.js";
        int lineNumber = 1;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                if(!line.equals("")
                        && !line.endsWith("{")
                        && !line.endsWith("}")
                        && !line.contains("if")
                        && !line.contains("else")){
                    System.out.println("Line " + lineNumber + ": Missing semicolon.");
                }
                line = reader.readLine();
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("the file was not found");
        }
        return "Hello";
    }
}
