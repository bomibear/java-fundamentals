package basicsLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class DupesTest {
    @Test
    public void DoesNotContainDupes(){
        int[] arr = {1,2,3,4,5,6};
        Dupes dupes = new Dupes();

        Boolean result = dupes.containsDuplicates(arr);

        assertFalse("There should be no dupes", result);
    }

    @Test
    public void ContainsDupes(){
        int[] arr = {1,2,3,4,6,6};
        Dupes dupes = new Dupes();

        Boolean result = dupes.containsDuplicates(arr);

        assertFalse("There should be dupes", result);
    }

}