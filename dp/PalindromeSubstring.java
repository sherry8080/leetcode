package dp;

public class PalindromeSubstring {
    public int countSubstrings(String s) {

        int count = 0;
        int n = s.length();
        if(n == 0){
            return 0;
        }

        boolean[][] table = new boolean[n][n];

        for(int i = 0; i < n; i++){
            table[i][i] = true;
            count++;
        }

        for(int i = 0; i < n - 1; i++){
            if(table[i][i] == table[i][i+1]){
                count++;
                table[i][i+1] = true;
            }
        }

        for(int i = 3; i < n + 1; i++){
            for(int j = i; j < n - i + 1; j++){
                int k = i + j - 1;
                if(table[j+1][k-1] && s.charAt(j) == s.charAt(k)){
                    table[j][k] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
