class Solution {
    public int maxProduct(int[] nums) {
        int firstlargest = 0;
        int secondlargest = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= firstlargest){
            secondlargest = firstlargest;
            firstlargest = nums[i];
            }
            else if (nums[i] > secondlargest) secondlargest = nums[i];
        }
        return (firstlargest-1)*(secondlargest-1);
    }
}