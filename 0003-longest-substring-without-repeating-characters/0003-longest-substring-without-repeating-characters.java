class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, maxi = 0;
        while(end < s.length()){
            if(!map.containsKey(s.charAt(end))){
                map.put(s.charAt(end),end);
            }
            else{
                start = Math.max(start,map.get(s.charAt(end))+1);
                map.put(s.charAt(end),end);
            } 
                int len = end-start+1;
                maxi = Math.max(len,maxi);
                end++;
        }
        return maxi;
    }
}