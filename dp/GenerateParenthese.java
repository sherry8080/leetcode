package dp;

import java.util.*;

public class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return Arrays.asList("");
        } else if (n == 1) {
            return Arrays.asList("()");
        } else {
            Set<String> set = new HashSet<>(n * 2);
            for (String s : generateParenthesis(n - 1)) {
                char[] ca = s.toCharArray();
                int len = s.length();
                for (int i = 0; i < len; i++) {
                    set.add(String.copyValueOf(ca, 0, i) + "()"
                            + String.copyValueOf(ca, i, len - i));
                }
            }
            return new ArrayList<String>(set);
        }
    }

    public static void main(String args[]){
        GenerateParenthese g = new GenerateParenthese();
        System.out.println(g.generateParenthesis(5));
    }


}
