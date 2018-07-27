package string;

/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:
        'A' : Absent.
        'L' : Late.
        'P' : Present.
        A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

        You need to return whether the student could be rewarded according to his attendance record.

        Example 1:
        Input: "PPALLP"
        Output: True
        Example 2:
        Input: "PPALLL"
        Output: False
*/


public class CheckReport {

    public static void main(String args[]) {
        if(checkRecord("PPALLL")) {
            System.out.println("good");
        }
    }

    public static boolean checkRecord(String s) {
        int len = s.length();
        int count_A = 0;

        if(s.contains("LLL")){
            return false;
        }
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == 'A'){
                count_A++;
            }
            if(count_A > 1) {
                return false;
            }

        }
        return true;
    }

}
