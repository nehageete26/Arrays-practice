class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String p = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String s[] = p.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String word : banned){
        set.add(word);
    }    
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(!set.contains(s[i]) && !s[i].isEmpty()) map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        String ans = "";
        int max = 0;
        for(String word : map.keySet()){
        if(map.get(word) > max){
        max = map.get(word);
        ans = word;
    }
        }
        return ans;
    }
}