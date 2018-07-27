package string;

import java.util.HashSet;

/*Write a function that takes a string as input and reverse only the vowels of a string.

        Example 1:
        Given s = "hello", return "holle".

        Example 2:
        Given s = "leetcode", return "leotcede".

        Note:
        The vowels does not include the letter "y".*/

public class Vowels {
    public static void main(String args[]){
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        HashSet set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            while(start < end && !set.contains(ch[start])){
                start++;
            }
            while(start < end && !set.contains(ch[end])){
                end--;
            }
            char temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;

            start++;
            end--;
        }

        return new String(ch);
    }

}
