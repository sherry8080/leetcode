package divide_conquer;

public class MajorityElement {

    public int count(int[] a, int left, int right, int element) {
        int count = 0;
        for (int i = left; i <= right; i++)
        {
            if (a[i] == element)
            {
                count++;
            }
        }
        return count;
    }

    public int get_majority_element(int[] a, int left, int right) {

        if (left > right) return -1;
        if (left == right) return a[left];
        int mid = left + (right - left) / 2;
        int leftCount = get_majority_element(a, left, mid);
        int rightCount = get_majority_element(a, mid + 1, right);
        if (leftCount == -1 && rightCount != -1) {
            int num = count(a, left, right, rightCount);
            if (num > (right - left + 1) / 2) {
                return rightCount;
            }else {
                return -1;
            }
        }else if (rightCount == -1 && leftCount != -1) {
            int num = count(a, left, right, leftCount);
            if (num > (right - left + 1) / 2) {
                return leftCount;
            }else{
                return -1;
            }
        }else if (leftCount != -1 && rightCount != -1){
            int leftNum = count(a, left, right, leftCount);
            int rightNum = count(a, left, right, rightCount);
            if (leftNum > (right - left + 1) / 2) {
                return leftCount;
            }else if (rightNum > (right - left + 1) / 2){
                return rightCount;
            }else {
                return -1;
            }
        }else{
            return -1;
        }
    }

    public int majorityElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        return get_majority_element(nums, low, high);
    }
}
