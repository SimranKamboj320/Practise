public class Merge_String {
    public static String[] Merge(String arr[], int low, int high){
        if(low == high){
            String[] A = {arr[low]};
            return A;
        }
        int mid = low+(high+low)/2;
        String arr1[] = mergeSort(arr, low, mid);
        String arr2[] = mergeSort(arr, mid+1, high);

        String arr3[] = merge(arr1, arr2);
        return arr3;
        }
        public static String merge[](String arr1[], String arr2[]){
            int m = arr1.length;
            int n = arr2.length;
            String arr3[] = new String[m+n];

            int idx=0;
            
            int i=0;
            
            int j=0;

            while(i<m && j<n){
                if(isAlphabeticallySmaller(arr1[i], arr2[j])){
                    arr3[idx] = arr1[i];
                    i++;
                    idx++;
                }else{
                    arr3[idx] = arr2[j];
                    j++;
                    idx++;
                }
            }
            while(i < m){
                arr3[idx]=arr1[i];
                i++;
                idx++;
                
            }

        }
}
