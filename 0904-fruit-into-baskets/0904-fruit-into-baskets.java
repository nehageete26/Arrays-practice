class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j = 0, length = 0, maxi = 0;
        while(j < fruits.length){
            if(map.size() <= 2){
                map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
                j++;
                while(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
                i++;
                }
                length = j-i;
                maxi = Math.max(maxi , length);
            }
        }
        return maxi;
    }
}