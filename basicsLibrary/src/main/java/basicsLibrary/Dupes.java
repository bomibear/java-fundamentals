package basicsLibrary;

public class Dupes {
    public Boolean containsDuplicates(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]) return false;
            }
        }

        return true;
    }
}
