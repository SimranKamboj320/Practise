import java.util.*;

public class Largest{
    public static int Large(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,65,8};
        System.out.println(Large(num));
    }
}