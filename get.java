import java.util.*;

public class get{

    public static int getith(int i, int n){
        int bitmask = 1<<i;
        if((bitmask & n) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.print(getith(2, 10));
    }
    
}


