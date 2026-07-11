// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int missing = 1; // becoz we want +ve missing 
//         Arrays.sort(nums); // not valid solution becoz tc -> o(nlogn)
//         for(int i= 0; i< nums.length; i++){
//         if(nums[i] > 0){
//             if(nums[i] == missing) missing++;
//             else if(nums[i] > missing) break;
//         } 
//         }
//         return missing;
//     }
// }

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0 && nums[i] <= n){
                seen[nums[i]] = true;
            }
        }
        for(int i = 1; i <= n; i++){
            if(seen[i] == false){
                return i;
            }
        }
        return n + 1;
    }
}