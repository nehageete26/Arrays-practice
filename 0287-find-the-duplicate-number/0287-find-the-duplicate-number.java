// TC -> O(N^2) -. USE HASHSET INSTEAD
// class Solution {
//     public int findDuplicate(int[] nums) {
//       for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[i]==nums[j]) return nums[i];
//         }
//       } 
//       return -1; 
//     }
// }
// USING HASHSET->
// class Solution{
//     public int findDuplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(set.contains(nums[i])) return nums[i];
//             else set.add(nums[i]);
//         }
//         return -1;
//     }
// }
// OPTIMAL
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find entrance of cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}