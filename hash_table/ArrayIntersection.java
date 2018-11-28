package hash_table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        if(nums1.length < nums2.length){
            for(int i = 0; i < nums1.length; i++){
                if(set2.contains(nums1[i])){
                    set.add(nums1[i]);
                }
            }

        }else{
            for(int i = 0; i < nums2.length; i++){
                if(set1.contains(nums2[i])){
                    set.add(nums2[i]);
                }
            }
        }
        int[] ans = new int[set.size()];
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        for(int i = 0; i < set.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] a1 = {4,9,5};
        int[] a2 = {9,4,9,8,4};
        ArrayIntersection a = new ArrayIntersection();
        int[] ans = a.intersection(a1, a2);
        for(int i = 0; i < ans.length; i++){
            System.out.print(" " + ans[i]);
        }
    }
}
