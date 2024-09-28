import java.util.*;

public class FirstOccurance {
    public static int first(int arr[], int i, int key){
        if(arr.length-1 == i){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, i+1, key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int key = 3;
        System.out.println(first(arr, i, key));
    }
    
}
