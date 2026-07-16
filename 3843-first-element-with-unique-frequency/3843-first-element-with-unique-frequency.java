class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int freq:map.values()){
            freqmap.put(freq,freqmap.getOrDefault(freq,0)+1);
        }
         for(int i = 0; i < nums.length; i++){
            if(freqmap.get(map.get(nums[i])) == 1)
                return nums[i];
        }
        return -1;
    }
}