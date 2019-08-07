package basicsLibrary;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    public int[] roll(int n){
        int[] results = new int[n];

        for(int i = 0; i < n; i++){
            results[i] = generateNum(6, 1);
        }

        System.out.println(Arrays.toString(results));
        return results;
    }

    public int generateNum(int max, int min){
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
