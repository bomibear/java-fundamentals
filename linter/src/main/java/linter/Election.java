package linter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {
    public String tally(List<String> votes){
        StringBuilder sb = new StringBuilder();

        //tally votes
        HashMap<String, Integer> voteCount = new HashMap<>();
        for(String person : votes){
            if(!voteCount.containsKey(person)){
                voteCount.put(person, 1);
            } else {
                voteCount.put(person, voteCount.get(person) + 1);
            }
        }

        //iterate through the HashMap
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {

            if (maxEntry == null
                    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        sb.append(maxEntry.getKey() + " received the most votes!");
        return sb.toString();
    }
}
