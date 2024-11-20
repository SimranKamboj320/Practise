import java.util.ArrayList;

public class AL_Lonely {
    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            // Check if num appears only once in the ArrayList
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == num) {
                    count++;
                    if (count > 1) break; // No need to check further if count > 1
                }
            }
            // Check if num - 1 and num + 1 are not present
            if (count == 1 && !nums.contains(num - 1) && !nums.contains(num + 1)) {
                lonelyNumbers.add(num);
            }
        }
        return lonelyNumbers;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        // Find and print lonely numbers
        ArrayList<Integer> result = findLonelyNumbers(nums);
        System.out.println(result); 
    }
}
