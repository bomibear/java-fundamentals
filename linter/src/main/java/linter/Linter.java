package linter;

import java.io.*;

public class Linter {
    public static void main(String[] args) {
        LinterCheck("./src/main/resources/gates.js");
    }

    public static String LinterCheck(String filePath){
        int lineNumber = 1;
        boolean mistakeFound = false;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            if(line == null){
                sb.append("Empty file");
                System.out.println("Empty file");
                return sb.toString();
            }
            while (line != null) {
                if(!line.equals("")
                        && !line.endsWith("{")
                        && !line.endsWith("}")
                        && !line.contains("if")
                        && !line.contains("else")){
                    sb.append("Line " + lineNumber + ": Missing semicolon.\n");
                }
                line = reader.readLine();
                lineNumber++;
                mistakeFound = true;
            }
        } catch (IOException e) {
            System.out.println("the file was not found");
        }
        System.out.println(sb.toString());
        System.out.println(sb.toString().length());
        return sb.toString();
    }

}
