import java.util.*;

public class isSortedRecur{
    public static boolean Sort(int i, int arr[]){
        if(arr.length-1 == i){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return Sort(i+1, arr);
    }
    public static void main(String args[]){
        int i=1;
        int arr[] = {1,2,6,4,5};
        System.out.println(Sort(i, arr));
    }
}