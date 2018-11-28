package bit_manipulation;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int i, j;
        int m = A.length;
        int n = A[0].length;
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                A[i][j] = A[i][j] ^ 1;
            }
            for(j = 0; j < n / 2; j++){
                int tmp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = tmp;
            }
            if(n % 2 == 1) {
                A[i][n/2] ^= 1;
            }
        }
        return A;
    }

    public static void main(String args[]){
        FlippingImage f = new FlippingImage();
        int[][] arr = {{1,1,0,0},{1,0,1,0},{0,0,0,0}};
        f.flipAndInvertImage(arr);

    }
}
