package dp;

import string.UniqueEmail;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];
        for(int i = 0; i<m;i++){
            ans[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            ans[0][j] = 1;
        }
        for(int i = 1;i < m; i++){
            for(int j = 1;j<n;j++){
                ans[i][j] = ans[i-1][j] + ans[i][j-1];
            }
        }
        return ans[m-1][n-1];

    }

    public static void main(String args[]){
        UniquePaths u = new UniquePaths();
        System.out.println(u.uniquePaths(3,2));
    }
}

