class Solution {
    public int findGCD(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        // gcd of smallest nd largest -> gcd(largest,smallest)
        while (smallest != 0) {
            int temp = smallest;
            smallest = largest % smallest;
            largest = temp;
        }
        return largest;
    }
}