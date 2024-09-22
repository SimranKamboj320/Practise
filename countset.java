import java.util.*;

public class countset{
    public static int counts(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(counts(n));
    }
} 