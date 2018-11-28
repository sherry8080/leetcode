package two_pointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumZero {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = nums.length;
        int j, k;
        for(int i = 0; i < n - 2; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            j = i + 1;
            k = n - 1;
            while(j < k) {
                if (nums[j] + nums[k] + nums[i] == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }else if(nums[j] + nums[k] + nums[i]  > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return list;
    }
}
