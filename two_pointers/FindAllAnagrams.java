package two_pointers;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    // s longer
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList list = new ArrayList();
        int[] counts = new int[26];
        if(s.length() > p.length()){
            int i ;
            for(i = 0; i < p.length(); i++){
                counts[p.charAt(i) - 'a']++;
                counts[s.charAt(i) - 'a']--;
            }
            if (allZero(counts)) list.add(0);

            // Traverse other windows
            int j;
            for (j = p.length(); j < s.length(); ++j) {
                counts[s.charAt(j) - 'a']--;
                counts[s.charAt(j - p.length()) - 'a']++;
                if (allZero(counts)) list.add(j - p.length() + 1);
            }
        }
        return list;
    }

    public boolean allZero(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) return false;
        }
        return true;
    }

    public static void main(String args[]){
        String s = "cbaebabacd";
        String p = "abc";
        FindAllAnagrams f = new FindAllAnagrams();
        System.out.println(f.findAnagrams(s, p));
    }
}
