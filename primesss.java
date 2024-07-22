import java.util.*;

public class primesss{
    public static void Primess(int num){

        boolean prime = true;
        for(int i=2; i<=num; i++){
            if(num%i==0){
                prime = false;
                
            }
        }
    }
    public static void main(StringArray args[]){
        Primess(10);
        
    }
}