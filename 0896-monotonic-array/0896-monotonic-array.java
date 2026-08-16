class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        boolean isincrease = true;
        boolean isdecrease = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]) isdecrease = false;
            if(nums[i] > nums[i+1]) isincrease = false;
            }
            return isincrease || isdecrease;
    }
    }
