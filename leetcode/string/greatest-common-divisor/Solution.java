public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String concat1 = str1 + str2;
        String concat2 = str2 + str1;
        int len1 = str1.length();
        int len2 = str2.length();

        if (!concat1.equals(concat2)) {
            return "";
        }

        while (len2 != 0) {
            int temp = len2;
            len2 = len1 % len2;
            len1 = temp;
        }

        return str1.substring(0, len1);
    }
}
