import java.util.*;

public class SumRecur{
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        //int fn = Fac(n-1);
        int sum1 = n+sum(n-1); 
        return sum1;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(sum(n));
    }
}