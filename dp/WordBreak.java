package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>(wordDict);

        dp[0] = true;
        for(int i = 1; i < s.length() + 1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String args[]){
        WordBreak w = new WordBreak();
        String s = "leetcode";
        List list = new ArrayList();
        list.add("leet");
        list.add("code");
        System.out.println(w.wordBreak(s, list));
    }
}
