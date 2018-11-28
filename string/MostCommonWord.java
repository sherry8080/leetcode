package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strs = paragraph.toLowerCase().split("\\W+");
        Set set = new HashSet();
        int count = 0;
        int max = 0;
        String ans = "";
        if(strs.length == 1) return strs[0];

        for(String s: banned){
            set.add(s);
        }

        Map<String, Integer> map = new HashMap<>();

        for(String str: strs){
            if(set.contains(str)){
                continue;
            }
            if(!map.containsKey(str)){
                map.put(str, 1);
                count = 1;
            }else{
                count = map.get(str) + 1;
                map.put(str, count);
            }
            if(count > max){
                max = count;
                ans = str;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        MostCommonWord m = new MostCommonWord();
        String[] banned = {"hit"};
        System.out.println(m.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
    }
}
