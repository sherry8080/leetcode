package dp;

public class ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] arr) {
        int count = 0;
        if(arr.length < 3) return 0;
        for(int i = 0; i < arr.length; i++){
            int diff = arr[i + 1] - arr[i];
            for(int j = 0; j < arr.length; j++) {
                for(int k = 0; k < arr.length; k++) {

                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};
        System.out.println(numberOfArithmeticSlices(arr));
    }
}
