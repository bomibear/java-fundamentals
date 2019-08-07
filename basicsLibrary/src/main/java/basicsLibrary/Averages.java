package basicsLibrary;

public class Averages {
    public double calcAvg(int[] arr){
        double total = 0;
        for(int n: arr){
            total += n;
        }
        return total/arr.length;
    }
}
