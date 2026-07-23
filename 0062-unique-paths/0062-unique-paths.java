// class Solution {
//     public int countways(int i, int j, int m, int n){
//         if(i == m-1 && j == n-1) return 1;
//         if(i >= m || j >=n) return 0;
//         else return countways(i+1,j,m,n) + countways(i,j+1,m,n);
//     }
//     public int uniquePaths(int m, int n) {
//         return countways(0, 0, m, n);   
// }
// }
// the above is done using recursion -> tc -> (2^(m+n)) -> gives tle.


// use of dp comes -> here we made a dp table and converted out recursion code in dp 
class Solution {
public int countways(int i, int j,int m,int n, int dp[][]){
        if(i == m-1 && j == n-1) return 1;
        if(i >= m || j >=n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countways(i+1,j,m,n,dp) + countways(i,j+1,m,n,dp);
     }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return countways(0, 0, m, n, dp);
    }
}