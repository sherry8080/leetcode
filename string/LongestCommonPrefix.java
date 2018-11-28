package string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int n = strs.length;
        String prefix = strs[0];
        for(int i = 1; i < n; i++){
            while(prefix != ""){
                if(strs[i].indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length() - 1);
                }else{
                    break;
                }
            }
        }
        return prefix;
    }

    public static void main(String args[]){
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] str = {"cbr650", "cb500f","cbr"};
        System.out.println(l.longestCommonPrefix(str));
    }
}
