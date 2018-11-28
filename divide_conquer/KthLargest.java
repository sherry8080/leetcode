package divide_conquer;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,k-1);
    }
    public int quickSelect(int[] nums, int start, int end, int k){
        if(start == end){
            return nums[start];
        }
        // by the time partitian is done, pivot is always sorted,
        // and its index is pivotIndex th largest number
        int pivotPoint = randomPivot(start,end);
        int pivotIndex = partitian(nums,start,end,pivotPoint);

        if(k == pivotIndex){
            return nums[pivotIndex];
        } else if(k < pivotIndex){
            return quickSelect(nums,start,pivotIndex-1,k);
        } else {
            return quickSelect(nums,pivotIndex+1,end,k);
        }
    }

    // standard quicksort partitian function
    public int partitian(int[] nums, int start, int end, int pivot){
        int pivotVal = nums[pivot];
        swap(nums,pivot,end);
        int i = start - 1;

        // pivoting action..
        for(int j=start;j<=end-1;j++){
            if(nums[j] > pivotVal){
                i++;
                swap(nums,i,j);
            }
        }
        // place pivot in its final position
        nums[end] = nums[i+1];
        nums[i+1] = pivotVal;
        // return the pivot index
        return i+1;
    }

    public int randomPivot(int start, int end){
        return start + (int)Math.floor(Math.random()%(start-end+1));
    }

    public void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String args[]){
        int[] arr = {3,2,1,5,6,4};
        KthLargest k = new KthLargest();
        System.out.println(k.findKthLargest(arr, 2));
    }
}
