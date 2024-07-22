import java.util.*;

public class Factorial{
    public static int factorial(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = num*i;
        }
        return num;
    }
    public static  void main(StringArray args[]){
        
        System.out.println(factorial(4));
    }
}