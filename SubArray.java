import java.util.*;

public class SubArray{
    public static void Pair(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(num[k]+ " " );
                }
                System.out.println();
            }
            System.out.println();
        }       
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        Pair(num);
        System.out.println(num);
    }
}