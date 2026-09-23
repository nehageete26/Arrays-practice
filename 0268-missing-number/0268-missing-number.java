class Solution {
    public int missingNumber(int[] nums) {
        int actual = 0 , totalsum = 0;
        for(int i=0;i<=nums.length;i++){
            totalsum += i;
        }
        for(int i=0;i<nums.length;i++){
            actual += nums[i];
        }
        return totalsum - actual;
    }
}