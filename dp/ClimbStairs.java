package dp;

import java.util.HashMap;

// Runtime limit
public class ClimbStairs {
    public static int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        HashMap<Integer, Integer> map = new HashMap();
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            int value =  climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, value);
            return value;
        }

    }

    public static void main(String args[]) {
        System.out.println(climbStairs(10));
    }
}
