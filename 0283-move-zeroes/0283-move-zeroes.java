class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length) {
            while (i < j && nums[i] != 0) {
                i++;
            }
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else
                j++;
        }
    }
}