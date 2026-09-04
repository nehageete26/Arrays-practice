class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0, maxi = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) > maxi) {
                maxi = map.get(i);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == maxi) {
                sum += map.get(i);
            }
        }
        return sum;
    }
}