import java.util.*;
public class AL {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        //add function
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,10);

        System.out.println(list);

        //get operation - O(1)
        int element = list.get(1);
        System.out.println(element);

        //remove operation
        list.remove(0);
        System.out.println(list);

        //set operation
        list.set(1,5);
        System.out.println(list);

        //contain operation
        System.out.println(list.contains(2));
        

    }
    
}
