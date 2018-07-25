package string;

/*Given a balanced parentheses string S, compute the score of the string based on the following rule:

        () has score 1
        AB has score A + B, where A and B are balanced parentheses strings.
        (A) has score 2 * A, where A is a balanced parentheses string.


        Example 1:

        Input: "()"
        Output: 1
        Example 2:

        Input: "(())"
        Output: 2
        Example 3:

        Input: "()()"
        Output: 2
        Example 4:

        Input: "(()(()))"
        Output: 6


        Note:

        S is a balanced parentheses string, containing only ( and ).
        2 <= S.length <= 50*/

public class ScoreOfParentheses {

    public static void main(String args[]) {
        System.out.println(scoreOfParentheses("(()(()))"));
    }

    public static int scoreOfParentheses(String S) {
        int l = S.length();
        int count = 0;
        int bal = 0;
        for(int i = 0; i < l; i++) {
            if(S.charAt(i) == '(') {
                bal++;
            }
            if(S.charAt(i) == ')'){
                bal--;
            }
            if(bal == 0) {

            }
        }
        return count;
    }
}
