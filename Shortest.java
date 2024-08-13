import java.util.*;

public class Shortest{
    public static float Short(String str){
        int x = 0;
        int y = 0;

        for(int i=0; i<=str.length()-1; i++){
            char dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else{
                x++;
            }
        }
        int a = x*x;
        int b = y*y;

        return (float)Math.sqrt(a+b);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(Short(str));
    }

}