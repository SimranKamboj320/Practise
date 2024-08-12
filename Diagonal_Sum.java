import java.util.*;

public class Diagonal_Sum{
    public static int Diagonal(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                if(i+j==matrix.length-1 && i!=j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int sum = Diagonal(matrix);
        System.out.println(sum);
    }
}