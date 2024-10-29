import java.util.*;

public class Quick{

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
    public static void Quicks(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pvt = partition(arr, si, ei);
        Quicks(arr, si, pvt-1);
        Quicks(arr, pvt+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {3,5,7,4,8,3,6};
        Quicks(arr, 0, arr.length-1);
        printArr(arr);
    }
}