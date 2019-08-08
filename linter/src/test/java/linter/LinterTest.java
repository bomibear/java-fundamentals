package linter;

import org.junit.Test;

import java.io.*;


import static org.junit.Assert.*;

public class LinterTest {
    @Test
    public void canCheckAnEmptyFile(){
        String filePath = "./src/main/resources/gates.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        String expected = "Empty file";
        assertTrue(actual.equals(expected));

    }
//    @Test
//    public void canCheckIfEmpty(){
//        String filePath = "./src/main/resources/empty.js";
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(filePath));
//            String line = reader.readLine();
//            if (reader.readLine() == null) {
//                System.out.println("No errors, and file empty");
//            }
//        } catch (IOException e) {
//            System.out.println("the file was not found");
//        }
//
//        Linter newLinter = new Linter();
//        newLinter.LinterCheck();
//        String expected = "Hello";
//        String actual = "Hello";
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void canCheckIfEmpty(){
//        Linter newLinter = new Linter();
//        newLinter.LinterCheck();
//        String expected = "Hello";
//        String actual = "Hello";
//        assertEquals(expected, actual);
//    }

}