import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    static boolean uniqueOccurrences(int[] arr) {
        var freq = new HashMap<Integer, Integer>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        var set = new HashSet<Integer>(freq.values());

        return set.size() == freq.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 })); // true
        System.out.println(uniqueOccurrences(new int[] { 1, 2 })); // false
        System.out.println(uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 })); // true
    }
}
