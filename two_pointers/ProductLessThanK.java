package two_pointers;

public class ProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int product = 1;
        while(start < nums.length){

            product = product * nums[end];
        }
        return -1;
    }
}
