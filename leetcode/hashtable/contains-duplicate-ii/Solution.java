import java.util.HashMap;

public class Solution {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute Force: O(n^2) | O(1)
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++){
        // if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
        // }
        // }

        // return false;

        // HashMap: O(n) | O(n)
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k)
                return true;

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3)); // true
        System.out.println(containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1)); // true
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2)); // false
    }
}
