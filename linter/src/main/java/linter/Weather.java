package linter;

import java.util.ArrayList;
import java.util.HashSet;

public class Weather {
    public String analyzeWeather(int[][] arr){
        int min = findMin(arr);
        int max = findMax(arr);

        //find values not seen that month
        HashSet<Integer> uniqueValues = findUniqueTemps(arr);
        ArrayList<Integer> notSeenValues = new ArrayList<>();

        //iterate from min-max and create string of temps not seen
        for(int i = min; i <= max; i++){
            if(!uniqueValues.contains(i)) notSeenValues.add(i);
        }

        //create string with the result
        StringBuilder sb = new StringBuilder();
        sb.append("High: " + max);
        sb.append("\n");
        sb.append("Low: " + min);
        sb.append("\n");

        for(int n : notSeenValues){
            sb.append("Never saw temperature: " + n + "\n");

        }
        return sb.toString();
    }


    //keep track of unique temps
    public HashSet<Integer> findUniqueTemps(int[][] arr){
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(!result.contains(arr[i][j])){
                    result.add(arr[i][j]);
                }
            }
        }
        return result;
    }

    //find min value
    public int findMin(int[][] arr){
        int min = arr[0][0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min ) min = arr[i][j];
            }
        }

        return min;
    }

    //find max value
    public int findMax(int[][] arr){
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max ) max = arr[i][j];
            }
        }
        return max;
    }
}
