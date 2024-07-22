import java.util.*;

public class Floyd_Triangle{
    public static void Floyd(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(StringArray args[]){
        Floyd(5);
    }
}