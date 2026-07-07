class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int product_left = 1, product_right = 1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = product_right;
            product_right *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i] *= product_left;
            product_left *= nums[i];
        }
        return ans;
    }
}