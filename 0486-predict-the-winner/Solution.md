#  Predict the Winner - brute using recursion

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
At every turn, the current player has only two choices:
Pick the left number.
Pick the right number.

After picking one number, the opponent gets the next turn and also plays optimally. So, for each choice, we calculate the score difference we can achieve and choose the better one.

Instead of storing both players' scores, we store only the maximum score difference (Current Player − Opponent).

If the final score difference is greater than or equal to 0, Player 1 can win or at least tie, so we return true.
# Approach
<!-- Describe your approach to solving the problem. -->
1. Create a recursive function solve(i, j) that returns the maximum score difference (Current Player − Opponent) from the subarray nums[i...j].
2. If only one element is left (i == j), return that element because the current player takes it.
Otherwise, the current player has two choices:
Pick the left element: nums[i] - solve(i + 1, j)
Pick the right element: nums[j] - solve(i, j - 1)

3. Return the maximum of these two choices, since the current player always plays optimally.
4. Finally, check the result of solve(0, n - 1):
If it is greater than or equal to 0, return true.
Otherwise, return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(2^n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(n)

# Code
```java []
class Solution {
    int solve(int[] nums, int i, int j) {
        if (i == j) return nums[i];
        int Left = nums[i] - solve(nums, i + 1, j);
        int Right = nums[j] - solve(nums, i, j - 1);
        int ans = Math.max(Left, Right);
        return ans;
    }
    public boolean predictTheWinner(int[] nums) {
           return solve(nums,0,nums.length-1) >=0;
    }
}
```