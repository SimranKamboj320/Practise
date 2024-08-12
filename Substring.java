import java.util.*;

public class Substring{
    public static String Strings(String str, int si, int ei){
        String a = "";
        for(int i=si; i<ei; i++){
            a += str.charAt(i);
        }
        return a;
    }
    public static void main(String args[]){
        String str = "HELLOWORLD";
        System.out.println(Strings(str, 0, 4));
    }
}