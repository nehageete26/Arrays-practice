class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for (int num : nums) {
            if (map.get(num) == 2) {
                list.add(num);
                map.put(num, 0);
            }
        }
        return list;
    }
}