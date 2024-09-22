import java.util.*;

public class clearith{
    public static int clear(int i, int n){
        int bitmask = (~0)<<i;
        return bitmask & n;
    }
    public static void main(String args[]){
        System.out.println(clear(2, 15));
    }
}