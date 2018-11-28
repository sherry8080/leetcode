package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        Map map= new HashMap();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(!map.get((char)stack.pop()).equals(s.charAt(i))){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        ValidParenthese p = new ValidParenthese();
        System.out.println(p.isValid("()[]"));
    }
}
