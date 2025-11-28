class Solution {
    public boolean isPalindrome(String s) {
        String processed = s.toLowerCase();

        int left = 0;
        int right = processed.length() - 1;

        while (left < right) {

            // Passing if not letter or digit
            while (left < right && !Character.isLetterOrDigit(processed.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(processed.charAt(right))) {
                right--;
            }

            if (processed.charAt(left) != processed.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}