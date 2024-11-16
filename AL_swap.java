import java.util.*;
public class AL_swap {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int idx1 = 1;
        int idx3 = 3;

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3, temp);

        System.out.println(list);

    }
    
}
