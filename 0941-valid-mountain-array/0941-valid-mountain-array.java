class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int peak = 0;
        for(int i=1;i<arr.length-1;i++){
            int previous = arr[i-1];
            int current = arr[i];
            int next = arr[i+1];
            if(previous == current || next == current) return false;
            if(previous > current && next > current) return false; // neeche wala peak hai ye 
            if(previous < current && current > next){
                peak++;
                if(peak >1) return false;
            }
        }
        return peak == 1;
    }
}