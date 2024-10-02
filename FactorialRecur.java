import java.util.*;

public class FactorialRecur{
    public static int Fac(int n){
        if(n==0){
            return 1;
        }

        //int fn = Fac(n-1);
        int fn1 = n*Fac(n-1); 
        return fn1;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Fac(n));
    }
}