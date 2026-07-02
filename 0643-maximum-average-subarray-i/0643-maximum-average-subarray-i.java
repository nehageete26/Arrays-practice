class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0, sum=0, maxi=0;
        for(int j=0;j<k;j++){
            sum += nums[j];
        }
        maxi = sum;
        for(int j=k;j<nums.length;j++){
            sum += nums[j]-nums[i];
            i++;
            maxi = Math.max(maxi,sum);
        }
        return (double) maxi/k;
    }
}