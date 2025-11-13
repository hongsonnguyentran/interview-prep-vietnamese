public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                nums[index] = nums[cur];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}