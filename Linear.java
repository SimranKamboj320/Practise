import java.util.*;

public class Linear{
    public static int Search(int marks[], int key){
        for(int i=0; i<=marks.length; i++){ 
            if(marks[i] == key){
            return i;
            }
        }
        return -1;
    }
    public static void main(StringArray args[]){
        int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = Search(marks, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key found = " + index);
        }
    }
}