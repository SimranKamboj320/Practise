import java.util.*;

public class TileRecur{
    public static int Tile(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int ver = Tile(n-1);
        int hor= Tile(n-2);

        int total = ver+hor;
        return total;
    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(Tile(n));
    }
} 