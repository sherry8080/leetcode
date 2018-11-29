package binary_search;

public class Sqrt {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int left = 1;
        int right = x;
        int ans = 0;
        while(left <= right){   // <=
            int mid = left + (right - left) / 2;
            if(mid <= x / mid) {    // don't write  mid * mid <= x
                left = mid + 1;
                ans = mid;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

}
