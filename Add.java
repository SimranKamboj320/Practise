import java.util.*;

public class Add{
    public static int Sums(int a){
        int num = a;
        int sum = 0;

        while(num != 0){
            int rem = num%10;
            sum = sum + rem;

            num = num/10;
        }
        return sum;
    }
    public static void main(StringArray args[]){
        System.out.println(Sums(456));
    }
}