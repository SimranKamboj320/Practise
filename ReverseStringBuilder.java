import java.util.*;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        
        // Reverse the StringBuilder manually
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length() - 1 - i;
            // Swap characters at indices i and n
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(n));
            str.setCharAt(n, temp);
        }
        
        // Print the reversed StringBuilder
        System.out.println(str);
    }
}
