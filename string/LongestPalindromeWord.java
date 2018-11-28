package string;

public class LongestPalindromeWord {

    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] table = new boolean[len][len];
        int start = 0;
        int max = 1;
        String ans = "";

        for(int i = 0; i < len; i++){
            table[i][i] = true;
            ans = String.valueOf(s.charAt(i));
        }

        for(int i = 0; i < len-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                table[i][i+1] = true;
                max = 2;
                ans = s.substring(i,i+2);
            }
        }

        int i = 0, j = 0, k = 0;
        for(k = 3; k <= len; k++){
            for(i = 0; i < len-k+1; i++){
                j = i + k - 1;
                if(table[i+1][j-1] == true && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    if(k > max){
                        max = k;
                        ans = s.substring(i,i+k);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        LongestPalindromeWord l = new LongestPalindromeWord();
        System.out.println(l.longestPalindrome("ac"));
    }


}
