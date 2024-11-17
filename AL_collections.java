import java.util.*;
import java.util.Collections;

public class AL_collections {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);

        Collections.sort(list);
        System.out.println(list);//ascending

        //descending

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
    
}
