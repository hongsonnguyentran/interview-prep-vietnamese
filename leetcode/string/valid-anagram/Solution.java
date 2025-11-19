// import java.util.HashMap;
// import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Sorting: O(n log n) | O(1)
        // char[] ar1 = s.toCharArray();
        // char[] ar2 = t.toCharArray();

        // Arrays.sort(ar1);
        // Arrays.sort(ar2);

        // String up1 = Arrays.toString(ar1);
        // String up2 = Arrays.toString(ar2);

        // return up1.equals(up2);

        // =======================================

        // HashMap: O(n) | O(k)
        // Map<Character, Integer> freq = new HashMap<>();

        // for (char c : s.toCharArray()) {
        // freq.put(c, freq.getOrDefault(c, 0) + 1);
        // }

        // for (char c : t.toCharArray()) {
        // if (!freq.containsKey(c)) return false;

        // freq.put(c, freq.get(c) - 1);
        // if(freq.get(c) == 0) freq.remove(c);
        // }

        // return freq.isEmpty();

        // =======================================

        // Frequency array: O(N) | O(1)
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0)
                return false;
        }

        return true;
    }
}