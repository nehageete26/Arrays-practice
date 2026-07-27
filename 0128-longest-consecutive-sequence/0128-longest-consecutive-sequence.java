class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        int count = 1, maxi = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i+1]-nums[i] == 1){
                count++;
                maxi = Math.max(count,maxi);
            }
            else count = 1;
        }
        return maxi;
    }
}