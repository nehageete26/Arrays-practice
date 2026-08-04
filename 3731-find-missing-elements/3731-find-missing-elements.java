class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length <= 1) return list;
        for(int i=0;i<nums.length-1;i++){
            int current = nums[i];
            int next = nums[i+1];

            if(next - current > 1){
                for(int j= current+1;j<next;j++){
                    list.add(j);
                }
            }
        }
        return list;
    }
}