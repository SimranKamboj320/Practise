import java.util.*;

public class Recursion{
    public static void recur(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        recur(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n = 5;
        recur(n);
    }
}