import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int[] twoSum(int[] nums, int target) {
        // Brute Force: O(N^2) | O(1)
        /*
         * for (int i = 0; i < nums.length; i++) {
         * for (int j = i + 1; j < nums.length; j++) {
         * if (nums[i] + nums[j] == target) {
         * return new int[] { i, j };
         * }
         * }
         * }
         */

        // HashMap: O(N) | O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 2, 7, 11, 15 }, 9)); // Output: [0, 1]
        System.out.println(twoSum(new int[] { 3, 2, 4 }, 6)); // Output: [1, 2]
        System.out.println(twoSum(new int[] { 3, 3 }, 6)); // Output: [0, 1]
    }
}