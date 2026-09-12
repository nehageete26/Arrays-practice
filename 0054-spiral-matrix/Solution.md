# Spiral matrix 

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Think like a matrix which gets smaller after every round

# Approach
<!-- Describe your approach to solving the problem. -->
1. keep 4 boundaries:
top -> top row
bottom -> bottom row
left -> left column
right -> right column
2. Then traverse in this order:
Right -> Down -> Left -> Up
3. After completing each side, move that boundary inward.
4. Start with:
top = 0, bottom = last row, left = 0, right = last column.
5. Traverse the top row from left -> right. Then top++
6. Traverse the right column from top -> bottom. Then right--
7. Traverse the bottom row from right -> left. Then bottom--
8. if(top <= bottom) prevents processing a row that is already traversed.
9. Traverse the left column from bottom -> top. Then left++
10. if(left <= right) prevents processing a column that is already traversed.
11. Continue until:
top > bottom || left > right

# Complexity
- Time complexity: O(m*n) m cross n 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:o(m*n) m cross n 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length==0) return list;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top <= bottom && left <= right){
        for(int j=left;j<=right;j++){
           list.add(matrix[top][j]);
        }top++;
        for(int j=top;j<=bottom;j++){
            list.add(matrix[j][right]);
        }right--;
        if(top <= bottom){
        for(int j= right;j>=left;j--){
            list.add(matrix[bottom][j]);
        }}bottom--;
        if(left <= right){
        for(int j=bottom;j>=top;j--){
           list.add(matrix[j][left]);
        }}left++;
        }
        return list;
    }
}
```