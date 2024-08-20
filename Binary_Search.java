import java.util.*;

public class Binary_Search{
    public static int Binary(int nums[], int target){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                right = mid;
            }else{
                left = mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        int target = 4;
        
        System.out.println(Binary(nums, target));
    }
}