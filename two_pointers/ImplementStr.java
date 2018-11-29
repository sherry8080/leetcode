package two_pointers;

public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int window = needle.length();
        for(int i = 0; i < haystack.length() - window + 1; i++){
            if(needle.equals(haystack.substring(i, i + window))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        ImplementStr i = new ImplementStr();
        String s1 = "a";
        String s2 = "a";
        System.out.println(i.strStr(s1,s2));
    }
}
