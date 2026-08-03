class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int missing = 0;
        int ans[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        int sum = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                   dup = nums[i];
                   list.add(dup);
                   break;
                }
            }
        }
        int s = 0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        list.add((sum - s) + dup);
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
    return ans;
    } 
}