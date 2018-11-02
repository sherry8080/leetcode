package string;

import java.util.Scanner;

/*Initially, there is a Robot at position (0, 0). 
 * Given a sequence of its moves, judge if this robot makes a circle, 
 * which means it moves back to the original place.
 * The move sequence is represented by a string. 
 * And each move is represent by a character. 
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
 * The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false*/

public class judgeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(judgeCircle(str)){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	static boolean judgeCircle(String moves) {
		char[] chs = moves.toCharArray();
		
		int y = 0;
		int x = 0;
		
		for(char ch: chs) {
			if(ch == 'U') {
				y++;
			} 
			if(ch == 'D') {
				y--;
			}
			if(ch == 'R') {
				x++;
			}
			if(ch == 'L') {
				x--;
			}
		}
		
		return y == 0 && x == 0;   
	} 

}
