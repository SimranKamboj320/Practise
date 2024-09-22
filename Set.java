import java.util.*;


public class Set {
    public static int Setit(int n, int i){
        int bitmask = 1<<i;
        return bitmask | n;
    }
    public static void main(String args[]){
        System.out.println(Setit(10, 2));
    }
    
}
