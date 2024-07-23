import java.util.*;

public class Reverse{
    public static void Reverses(int num[]){
        int i = 0, j = num.length-1;

        while(i<j){
            int temp = num[j];
            num[j] = num[i];
            num[i] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        Reverses(num);

        for(int i=0; i<num.length; i++){
            System.out.println(num[i] + " ");
        } 
        System.out.println();
    }
}