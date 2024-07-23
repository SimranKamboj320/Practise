import java.util.*;

public class Sum_SubArray{
    public static void SubArray(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }    
            }
        }    
        System.out.println("Max Sum  " + maxSum);   
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        SubArray(num);
        System.out.println(num);
    }
}