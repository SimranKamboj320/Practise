import java.util.*;

public class LastOccurance {
    public static int last(int arr[], int i, int key){
        if(arr[0] == i){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return last(arr, i-1, key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,4,5,1, 3};
        int i = arr.length-1;
        int key = 4;
        System.out.println(last(arr, i, key));
    }
    
}
