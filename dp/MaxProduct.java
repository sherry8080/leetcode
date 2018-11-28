package dp;

public class MaxProduct {
    public int maximumProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int tmp = max;
            max = Math.max(nums[i] * max, nums[i] * min);
            max = Math.max(nums[i], max);
            min = Math.min(nums[i] * tmp, nums[i] * min);
            min = Math.min(min, nums[i]);
            ans = Math.max(max, ans);
        }

        return ans;
    }

    public static void main(String args[]){
        int[] arr = {-2,-3,-2,-4};
        MaxProduct m = new MaxProduct();
        System.out.println(m.maximumProduct(arr));
    }

}
