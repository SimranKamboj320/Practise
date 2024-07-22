import java.util.*;

public class bintodec{
    public static void decimal(int bin){
        int pow = 0;
        int dec = 0;

        while(bin>0){
            int lastdigit = bin%10;
            dec = dec + lastdigit*(int)(Math.pow(2, pow));

            bin = bin/10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(StringArray args[]){
        decimal(101);
    }
}