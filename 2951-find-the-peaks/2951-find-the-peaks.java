class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            int prev = mountain[i-1];
            int current = mountain[i];
            int next = mountain[i+1];

            if(prev < current && current > next){
                list.add(i); // add index not the value at that index
            }
        }
        return list;
    }
}