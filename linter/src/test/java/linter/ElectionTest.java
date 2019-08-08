package linter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ElectionTest {
    @Test
    public void canTallyVotes(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        Election newElection = new Election();

        String result = newElection.tally(votes);
        String expected = "Bush received the most votes!";

        assertEquals(result, expected);

    }

}