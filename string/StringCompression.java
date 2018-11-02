package string;

/*Given an array of characters, compress it in-place.

        The length after compression must always be smaller than or equal to the original array.

        Every element of the array should be a character (not int) of length 1.

        After you are done modifying the input array in-place, return the new length of the array.


        Follow up:
        Could you solve it using only O(1) extra space?


        Example 1:
        Input:
        ["a","a","b","b","c","c","c"]

        Output:
        Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

        Explanation:
        "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
        Example 2:
        Input:
        ["a"]

        Output:
        Return 1, and the first 1 characters of the input array should be: ["a"]

        Explanation:
        Nothing is replaced.
        Example 3:
        Input:
        ["a","b","b","b","b","b","b","b","b","b","b","b","b"]

        Output:
        Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

        Explanation:
        Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
        Notice each digit has it's own entry in the array.
        Note:
        All characters have an ASCII value in [35, 126].
        1 <= len(chars) <= 1000.*/

public class StringCompression {

    public static void main(String args[]) {
        char[] chars = {'a','a','b','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        if(chars.length == 0) return 0;

        int mark = 0;
        int write = 0;
        for(int i = 0; i < chars.length; i++){
            //若出现不同字母或到达字符串末尾
            if(i + 1 == chars.length || chars[i] != chars[i+1]){
                chars[write] = chars[mark];
                write++;
                if(mark < i){
                    //遍历字符出现次数，转化为字符数组（可能出现大于一位的数字）
                    for(char a : (""+(i-mark+1)).toCharArray())
                        chars[write++] = a;
                }
                mark = i + 1;
            }
        }
        return write;
    }
}
