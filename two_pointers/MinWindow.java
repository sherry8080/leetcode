package two_pointers;


public class MinWindow {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[] map = new int[128];

        for(int i = 0; i < t.length(); i++) {
            map[t.charAt(i)]++;
        }

        int begin = 0, end = 0, d = Integer.MAX_VALUE, counter = t.length(), head = 0;

        while(end < s.length()) {

            if(map[s.charAt(end)] > 0) {
                counter--;
            }

            map[s.charAt(end)]--;
            end++;

            while (counter == 0) {
                if(end - begin < d) {
                    d = end - begin;
                    head = begin;
                }
                if(map[s.charAt(begin)] == 0) {
                    counter++;
                }
                map[s.charAt(begin)]++;
                begin++;
            }
        }
        return d == Integer.MAX_VALUE ? "" :s.substring(head, head+d);
    }

    public static void main(String args[]){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinWindow m = new MinWindow();
        System.out.println(m.minWindow(s,t));
    }

}
