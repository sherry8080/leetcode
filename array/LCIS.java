package array;

public class LCIS {

    public int findLengthOfLCIS(int[] nums) {
        int start = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] <= nums[i-1]){
                start = i;
            }else{
                len = Math.max(i - start + 1, len);
            }
        }
        return len;
    }

    public static void main(String args[]){
        int[] arr = {2,2,2,2,2};
        LCIS l = new LCIS();
        System.out.println(l.findLengthOfLCIS(arr));
    }
}
