package array;

public class SortParity {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int tmp = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                ans[tmp++] = A[i];
            }
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                ans[tmp++] = A[i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = {4,1,3,2};
        SortParity s = new SortParity();
        int[] ans = s.sortArrayByParity(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
