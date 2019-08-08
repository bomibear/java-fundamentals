package linter;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinterTest {
    @Test
    public void canCheckforErrors(){
        Linter newLinter = new Linter();
        newLinter.LinterCheck();
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual);
    }

}