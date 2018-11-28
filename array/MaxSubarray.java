package array;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int sum = nums[0];
        int max = sum;
        for(int i = 1; i < nums.length; ++i){
            sum = (sum + nums[i]) > nums[i] ? (sum + nums[i]):nums[i];
            max = sum > max ? sum:max;
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
