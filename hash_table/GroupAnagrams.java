package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();
        for(String s: strs){
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String key = String.valueOf(chs);
            System.out.println(key);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String args[]){
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(s));
    }
}
