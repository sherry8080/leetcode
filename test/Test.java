package test;

public class Test {
    public static int solution(String version1, String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
            while (i < v1.length || i < v2.length) {
                if (i > v1.length || i > v2.length) {
                    return 0;
                }
                if (v1[i].compareTo(v2[i]) == 1) {
                    return 1;
                } else if (v1[i].compareTo(v2[i]) == -1) {
                    return -1;
                } else {
                    i++;
                    continue;
                }
            }
        return 0;
    }

    public static void main(String args[]){
        String s = "11.1.0.1";
        String t = "11.1.0.1";
        System.out.println(solution(s, t));
    }
}
