package basicsLibrary;

public class ArrayArray {
    public int[] lowestAvgArr(int[][] arr){
        double[] result = new double[arr.length];

        //calculate average of every array and store values in result
        Averages avg = new Averages();
        for(int i = 0; i < arr.length; i++){
            result[i] = avg.calcAvg(arr[i]);
        }

        //find out which value in result is the smallest
        double smallestAvg = smallestNum(result);

        //find which index that value is in
        int smallestIndex = 0;
        for(int j = 0; j < result.length; j++){
            if(result[j] == smallestAvg) smallestIndex = j;
        }
        System.out.println("smallest index is " + smallestIndex);
        return arr[smallestIndex];
    }

    //find smallest value in an array
    public double smallestNum(double[] arr){
        double smallest = Double.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

        return smallest;
    }

}
