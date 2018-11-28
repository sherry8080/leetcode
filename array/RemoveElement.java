package array;

public class RemoveElement {

    /*public void removeElement(int[] nums, int val) {

        int i ;
        int j;
        int count = 0;
        int n = nums.length;
        int[] tmp = nums;

        for(i = j = 0; i < n; i++){
            if(nums[i] != val){
                tmp[j++] = nums[i];
            }else{
                count++;
            }
        }

        for(i = 0; i < n - count; i++){
            System.out.print(" " + tmp[i]);
        }

    }*/

    public int removeElement(int[] nums, int val) {

        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] == val){
                nums[i] = nums[n - 1];
                n--;
            } else{
                i++;
            }
        }

        return n;

    }

    public static void main(String args[]){
        int[] arr = {0,1,2,2,3,0,4,2};
        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(arr, 2));

    }
}
