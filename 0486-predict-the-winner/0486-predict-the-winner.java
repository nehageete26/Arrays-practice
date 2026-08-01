class Solution {
    int solve(int[] nums, int i, int j) {
        if (i == j) return nums[i];
        int Left = nums[i] - solve(nums, i + 1, j);
        int Right = nums[j] - solve(nums, i, j - 1);
        int ans = Math.max(Left, Right);
        return ans;
    }
    public boolean predictTheWinner(int[] nums) {
           return solve(nums,0,nums.length-1) >=0;
    }
}