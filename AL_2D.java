import java.util.*;

public class AL_2D {
    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> current = mainlist.get(i);
            for(int j=0; j<current.size(); j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
            
        }
        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);
        
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> curr = mainlist.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }

 
    }
    
}
