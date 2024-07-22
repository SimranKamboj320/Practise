import java.util.*;

public class Binomial{
    public static int factorial(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = num*i;
        }
        return num;
    }
    public static int BinCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int BinCoeff = fact_n / (fact_r*fact_nr);
        return BinCoeff;
        }
    public static  void main(StringArray args[]){
        System.out.println(BinCoeff(5, 2));
    }
}