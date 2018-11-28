package array;

import tree.MaxDepth;

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;
        int n = nums.length;
        int k = 0;
        while(i < n && k < n){
            if(nums[i] == 0){
                int tmp = nums[i];
                for(j = i; j < n - 1; j++){
                    nums[j] = nums[j + 1];
                }
                nums[n - 1] = 0;
            }else{
                i++;
            }
            k++;
        }

        for(i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i]);
        }
    }

    public static void main(String args[]){
        int[] arr = {0,1,2,2,3,0,4,2};
        MoveZeros m = new MoveZeros();
        m.moveZeroes(arr);

    }
}
