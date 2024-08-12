import java.util.*;

public class KeyArray{
    public static int ArrMatrix(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int matrix[][] = {{4,7,8}, {8,8,7}};
        System.out.println(ArrMatrix(matrix, 7));
        //System.out.println(matrix, 7);
    }
}

