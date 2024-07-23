import java.util.*;

public class Pairs{
    public static void Pair(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ")" );
            }
            System.out.println();
        }       
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        Pair(num);
    }
}