class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i] >= 0) break;
        }
        for(int j=0;j<nums.length;j++){
            nums[j] *= nums[j];
        }
            int j = i - 1, k = 0;
            int arr[] = new int[nums.length];
            while(j >= 0 && i<arr.length){
                if(nums[i] < nums[j]) arr[k++] = nums[i++];
                else arr[k++] = nums[j--];
            }
                while(j >= 0){
                    arr[k++] = nums[j--];
                }
                while(i < nums.length){
                    arr[k++] = nums[i++];
                }
            return arr;
    }
}