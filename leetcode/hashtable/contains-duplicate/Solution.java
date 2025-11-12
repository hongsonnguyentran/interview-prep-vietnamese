import java.util.HashSet;

public class Solution {
    static boolean containsDuplicate(int[] nums) {
        // Brute Force: O(n^2) | O(1)
        /*
         * for (int i = 0; i < nums.length; i++) {
         * for (int j = i + 1; j < nums.length; j++) {
         * if (nums[i] == nums[j]) {
         * return true;
         * }
         * }
         * }
         * return false;
         */

        // HashSet - compare size with array length: O(n) | O(n)
        /*
         * HashSet<Integer> set = new HashSet<>();
         * for (int num : nums) {
         * set.add(num);
         * }
         * return set.size() < nums.length;
         */

        // HashSet - to store unique elements: O(n) | O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 })); // true
        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4 })); // false
    }
}