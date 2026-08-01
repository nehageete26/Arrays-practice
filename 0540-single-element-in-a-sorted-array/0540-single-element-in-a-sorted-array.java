class Solution {
    public int singleNonDuplicate(int[] nums) {
        // least prefrred 
        int n = nums.length;
    //     if (n==1) return nums[0];
    //     for(int i =0;i<n;i++){
    //         if(i==0){
    //             if(nums[i] != nums[i+1]){
    //                 return nums[i];
    //             }
    //         }
    //         else if (i==n-1){
    //             if(nums[i]!=nums[i-1]){
    //                 return nums[i];
    //             }
    //         }
    //         else{
    //             if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
    //                 return nums[i];
    //             }
    //         }
    //     }
    //    return -1; 

    //using binary search
    if(n==1) return nums[0];// edge case if only 1 element in array
    if(nums[0] != nums[1]) return nums[0]; // edge case for 1st element in array
    if(nums[n-1] != nums[n-2]) return nums[n-1]; // edge case for the last element in array
    int lower = 1;
    int upper = n-1;
    while(lower<=upper){
        int mid = (lower+upper)/2;
        if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]){
            return nums[mid]; // if the single element is at mid 
        }
        else if(mid%2==1 && nums[mid-1] == nums[mid] || mid%2==0 && nums[mid] == nums[mid+1])
        lower = mid + 1 ;
        else{
            upper = mid -1;
        }

    }
return -1;
    }
}


// int xor = 0;
// for(int i=0;i<nums.length;i++){
//     xor^=nums[i];
// }
// return xor;
//     }
// }