public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Tìm nguyên âm từ trái
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            // Tìm nguyên âm từ phải
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Hoán đổi nguyên âm
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
