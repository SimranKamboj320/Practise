import java.util.*;

public class BubbleSort{
    public static void Bubble(int num[]){
        int n = num.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void printNum(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int num[] = {5, 4, 1, 3, 2};
        Bubble(num);
        printNum(num);
    }
}