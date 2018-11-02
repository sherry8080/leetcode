package test;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {

    public static List<String> longest(String[] words) {
        ArrayList longestWords = new ArrayList();
        String str = "";
        for(String word: words) {
            if(word.length() > str.length()) {
                str = word;
            }
        }
        for(String word: words) {
            if(word.length() == str.length()) {
                longestWords.add(word);
            }
        }
        return longestWords;
    }

    public static List<String> longest1(String[] words) {
        ArrayList list = new ArrayList();
        String str = "";
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > str.length()) {
                str = words[i];
                list.clear();
                list.add(str);
            } else if(words[i].length() == str.length()){
                list.add(words[i]);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        String[] words = {"dog", "google", "face","sprite"};
        ArrayList list = new ArrayList(longest1(words));
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
