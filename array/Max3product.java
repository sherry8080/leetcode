package array;

import java.util.Arrays;

public class Max3product {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int max = Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
        max = Math.max(max, nums[n - 1] * nums[0] * nums[1]);
        max = Math.max(max, nums[n - 1] * nums[n - 2] * nums[0]);

        return max;

    }

    public static void main(String args[]){
        int[] arr = {-2,-3,-2,-4};
        Max3product m = new Max3product();
        System.out.println(m.maximumProduct(arr));
    }
}
