import java.util.*;

public class LinearSearch{
    public static int Linear(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        int key = 4;

        int result = Linear(num, key);
        if(result == -1){
            System.out.println("Key not found");
        }else{
            System.out.println(result);
        }
    }
}