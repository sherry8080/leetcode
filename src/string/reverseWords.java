package string;

/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String string: str) {
        	char[] ch = string.toCharArray();
        	int length = ch.length;
        	for(int i = 0; i < ch.length / 2; i++) {
        		char temp = ch[i];
        		ch[i] = ch[length-1-i];
        		ch[length-1-i] = temp;
        	}
        	sb.append(new String(ch) + " ");
        }
        return sb.toString().trim();
        
    }

}
