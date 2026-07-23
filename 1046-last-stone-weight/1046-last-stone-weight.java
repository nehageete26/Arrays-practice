class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<stones.length;i++){
            maxheap.offer(stones[i]);
        }
        while(maxheap.size() > 1){
            int largest = maxheap.peek();
            maxheap.poll();
            int slargest = maxheap.peek();
            maxheap.poll();
            if(largest != slargest){
                maxheap.offer(largest-slargest);
            }
        }
        if(maxheap.isEmpty()) return 0;
        else return maxheap.peek();
    }
}