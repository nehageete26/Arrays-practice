class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE, total_sum = 0, maxsum = 0, minsum = 0;
        for(int i=0;i<nums.length;i++){
            total_sum += nums[i];
            if(maxsum < 0) maxsum = 0;
            maxsum += nums[i];
            maxi = Math.max(maxsum,maxi);
            if(minsum > 0) minsum = 0;
            minsum += nums[i];
            mini = Math.min(mini,minsum);
        }
        if(maxi < 0) return maxi; // if all -ve nos
        int circular_sum = total_sum - mini;
        return Math.max(maxi,circular_sum);
    }
}