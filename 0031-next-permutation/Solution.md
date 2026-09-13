# next permutation

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Make the array just slightly bigger than the current permutation.
# Approach
<!-- Describe your approach to solving the problem. -->
1. Find the first smaller element from the right -> index1.
2. Find the smallest element from the right that is greater than nums[index1] -> index2.
3. Swap index1 and index2.
4. Reverse the part after index1 to make it as small as possible.
5. If no index1 exists, reverse the whole array.

# Complexity
- Time complexity: O(N)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int arr[],int a, int b){
        while(a < b) swap(arr,a++,b--);
    }
    int index1 = -1 ,index2 = -1;
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {
            index1 = i;
            break;
            }
        }
        if(index1 == -1){
            reverse(nums, 0 , nums.length-1);
            return;
        }
        for(int j = nums.length-1;j > index1; j--){
            if(nums[j] > nums[index1]){
                index2 = j;
                break;
            }
        }
        swap(nums , index1, index2);
        reverse(nums,index1+1,nums.length-1);
    }
}
```