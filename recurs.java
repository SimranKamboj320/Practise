import java.util.*;

public class recurs{
    public static void recur(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        recur(n-1);
        
    }
    public static void main(String args[]){
        int n = 5;
        recur(n);
    }
}