package linter;

import org.junit.Test;

import java.io.*;


import static org.junit.Assert.*;

public class LinterTest {
    @Test
    public void canCheckAnEmptyFile(){
        String filePath = "./src/main/resources/empty.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        String expected = "Empty file";
        assertTrue(actual.equals(expected));

    }

    @Test
    public void canCheckForNoErrors(){
        String filePath = "./src/main/resources/noError.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        assertTrue(actual.length() == 0);
    }

//    @Test
//    public void canCheckForFewErrors(){
//        String filePath = "./src/main/resources/fewError.js";
//
//        Linter newLinter = new Linter();
//        String actual = newLinter.LinterCheck(filePath);
//        assertTrue(actual.length() == 0);
//    }

    @Test
    public void canCheckForOneError(){
        String filePath = "./src/main/resources/oneError.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        assertTrue(actual.length() == 26);
    }

//    @Test
//    public void canCheckForManyErrors(){
//        String filePath = "./src/main/resources/manyError.js";
//
//        Linter newLinter = new Linter();
//        String actual = newLinter.LinterCheck(filePath);
//        assertTrue(actual.length() == 1);
//    }
}