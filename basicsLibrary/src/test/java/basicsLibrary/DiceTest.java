package basicsLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void DiceCanRoll(){
        int n = 4;
        Dice newDiceRoll = new Dice();

        assertEquals(newDiceRoll.roll(n).length, n);
    }

}