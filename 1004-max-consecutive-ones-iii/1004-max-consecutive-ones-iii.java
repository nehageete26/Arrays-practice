class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero = 0 , i=0, j=0, length = 0 , maxi = 0;
        while(j < nums.length){
            if(nums[j] == 0) zero++;
            while(zero > k){
                if(nums[i] == 0) zero--;
               i++;
            }
            length = j-i+1;
            maxi = Math.max(maxi , length);
            j++;
        }
        return maxi;
    }
}