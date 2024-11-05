public class Arr_Back {
    
    public static void Recur(int arr[], int i, int val){
        if(i == arr.length){
            prin(arr);
            return;
        }

        arr[i] = val;
        Recur(arr, i+1, val+1);
        arr[i] = arr[i]- 2;

    }
    
    public static void prin(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Recur(arr, 0, 1);
        prin(arr);
    }
}
