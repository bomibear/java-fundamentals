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

    @Test
    public void canCheckForOneError(){
        String filePath = "./src/main/resources/oneError.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        //each message line is 27 characters long, and 1 error message is 27 characters long
        assertTrue(actual.length() == 27);
    }

    @Test
    public void canCheckForFewErrors(){
        String filePath = "./src/main/resources/fewErrors.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        //each message line is 27 characters long, and 1 error message is 27 characters long
        //3 errors, so 27 * 3
        assertTrue(actual.length() == 81);
    }


    @Test
    public void canCheckForManyErrors(){
        String filePath = "./src/main/resources/manyErrors.js";

        Linter newLinter = new Linter();
        String actual = newLinter.LinterCheck(filePath);
        //each message line is 27 characters long, and 1 error message is 27 characters long
        //since the numbers after the line extends the msg length, errors are found on lines with 2 numbers
        //6 errors, so 28 * 10
        assertTrue(actual.length() == 280);
    }
}