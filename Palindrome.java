import java.util.*;

public class Palindrome{
    public static boolean isPalindrome(int num){
        int palindrome = num;
        int rev = 0;

        while(palindrome !=0){
            int rem = palindrome%10;
            rev = rev*10+rem;
            palindrome = palindrome/10;
        }
        if(num==rev){
            return true;
        }
        return false;
    }
    public static void main(StringArray args[]){
        System.out.println(isPalindrome(404));
    }
}