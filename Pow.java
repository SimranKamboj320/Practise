import java.util.*;

public class Pow{
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }

        int powerhalf = pow(x, n/2);
        int power = powerhalf*powerhalf;

        if(n%2 != 0){
            power = x*power;
        } 
        return power;
    }
    public static void main(String args[]){
        System.out.println(pow(2, 10));
    }
    
}
