class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        int dup = 0;
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

        //int[] ans=new int[2];
        // Set<Integer> s = new HashSet<>();
        // for(int x:nums){
        //     if(!s.add(x))
        //            ans[0] = x;
        // }
        // for(int i=1;i<=nums.length;i++) {
        //     if(!s.contains(i)){
        //         ans[1]=i;
        //         break;
        //     }
        // }
        // return ans;