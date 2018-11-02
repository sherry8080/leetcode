package dp;

public class MaxSumNonConsecutive {

    public static int maxSumSubSeqNonContagious(int a[]){
        int max_include[] = new int[a.length];
        int max_exclude[] = new int[a.length];
        max_include[0] = a[0];
        max_exclude[0] = Integer.MIN_VALUE;
        int max = a[0];

        for(int i = 1; i<a.length; i++){
            max_include[i] = Math.max(max_exclude[i-1]+a[i], a[i]);
            max_exclude[i] = Math.max(max_include[i-1], max_exclude[i-1]);
            max = Math.max(max_include[i], max_exclude[i]);
        }

        return max;
    }

    public static void main(String args[]){
        int[] arr = {2,1,5,3,4};
        System.out.print(maxSumSubSeqNonContagious(arr));
    }
}
