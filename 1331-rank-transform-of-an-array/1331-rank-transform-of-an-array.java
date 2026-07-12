class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int rank = 0;
        int dup[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
        dup[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                rank++;
                map.put(arr[i],rank);
            }
        }
        for(int i=0;i<dup.length;i++){
            ans[i] = map.get(dup[i]);
        }
        return ans;
    }
}