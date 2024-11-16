import java.util.*;

public class AL_Max {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
    
}
