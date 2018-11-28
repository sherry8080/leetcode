package hash_table;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) - 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) > 0){
                return nums[i];
            }
        }
        return nums[0];
    }

    public static void main(String args[]){
        int[] arr = {0,1,2,2,1,0,3};
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(arr));

    }
}
