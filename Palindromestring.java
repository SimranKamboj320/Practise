import java.util.*;

public class Palindromestring{
    public static boolean Palindrome(String str){
        for(int i=0; i<=str.length()/2; i++){
            int n = str.length()-1;
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Anla";
        
        System.out.println(Palindrome(str));
    }
}    