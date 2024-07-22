import java.util.*;

public class dectobin{
    public static void decimal(int dec){
        int myNum = dec;
        int pow = 0;
        int bin = 0;

        while(dec>0){
            int rem = dec%2;
            bin = bin + (rem*(int)Math.pow(10, pow));

            pow++;
            dec = dec/2;
        }
        System.out.println("Binary form of " + myNum + " = "+ bin);
    }
    public static void main(StringArray args[]){
        decimal(7);
    }
}