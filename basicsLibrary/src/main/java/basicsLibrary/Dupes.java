package basicsLibrary;

public class Dupes {
    public Boolean containsDuplicates(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; i++){
                if(arr[i] == arr[j]) return false;
            }
        }

        return true;
    }
}
