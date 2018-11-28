package hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Jewels {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        Set s = new HashSet();
        char[] stone = S.toCharArray();
        char[] jewel = J.toCharArray();
        for(char j: jewel){
            s.add(j);
        }
        for(char c: stone){
            if(s.contains(c)){
                ans++;
            }
        }
        return ans;
    }
}
