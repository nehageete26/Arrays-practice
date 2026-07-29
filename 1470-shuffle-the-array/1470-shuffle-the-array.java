class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        for(int i = n;i<nums.length;i++){
            list2.add(nums[i]);
        }
        int arr[] = new int[nums.length];
        int i=0,j=0;
        while(i < list2.size() && j < list.size()){
            arr[2*i] = list.get(j); // insert the elements at 0 , 2 , 4
            j++;
            arr[2*i+1] = list2.get(i);  // inserti the elments at 1 , 3 , 5
            i++;
        }
        return arr;
    }
}