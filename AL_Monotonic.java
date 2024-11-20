import java.util.*;

public class AL_Monotonic {
    public static boolean Mono(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                decreasing = false;
            }
            if (nums.get(i) > nums.get(i + 1)) {
                increasing = false;
            }
        }

        // If the array is either increasing or decreasing, it's monotonic
        return increasing || decreasing;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(3);

        System.out.println(Mono(nums)); // Output: true
    }
}
