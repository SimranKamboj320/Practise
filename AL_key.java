import java.util.*;
public class AL_key {
    public static int Keys(ArrayList<Integer> nums, int key){
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == key){
                count++;
                maxcount = Integer.MAX_VALUE(count, maxcount);
            }
        }
        return maxcount;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(20);

    }
    
}
