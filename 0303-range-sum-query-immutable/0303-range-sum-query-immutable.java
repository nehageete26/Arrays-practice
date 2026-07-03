class NumArray {
    int nums[];
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum += nums[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
public class Main{
    public static void main(String args[]){
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.print(obj.sumRange(0,2));
    }
}