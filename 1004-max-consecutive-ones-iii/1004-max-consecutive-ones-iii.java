class Solution {
    public int longestOnes(int[] nums, int k) {
        // TC -> O(N*N) SC -> O(1)
        // int max_length = 0;
        // for(int i=0;i<nums.length;i++){
        //     int zero = 0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0) zero ++;
        //         if(zero <= k){
        //             int length = j-i+1;
        //             max_length = Math.max(max_length,length);
        //         }
        //         else break;
        //     }
        // }
        // return max_length;
        // LETS USE SLIDING WINDOW CONCEPT TC -> O(N) SC = O(1)
        int left = 0 , maxlength = 0; int zero = 0;
        for(int right =0;right<nums.length;right++){
                if(nums[right]==0) zero ++;
                if(zero > k) {
                    if(nums[left] == 0) zero --;
                    left++;
                }
                if(zero <= k){
                    int length = right-left+1;
                    maxlength = Math.max(length, maxlength);
                }
        }
        return maxlength;
    }
}