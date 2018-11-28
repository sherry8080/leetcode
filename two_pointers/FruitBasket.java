package two_pointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitBasket {

    /*public int totalFruit(int[] tree) {
        int start = 0;
        int end = 1;
        int n = tree.length;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap();
        set.add(tree[0]);
        for(int i = 1; i < n; i++){
            if(!set.contains(tree[i])){
                set.add(tree[i]);
                if(set.size() < 3){

                }else{
                    set.remove(tree[start]);
                    start++;
                }
            }else{

            }
            ans = Math.max(ans, end - start);
            end++;
        }
        return ans;
    }*/

    public int totalFruit(int[] tree) {
        int ans = 0, i = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int j = 0; j < tree.length; ++j) {
            map.put(tree[j], map.getOrDefault(tree[j], 0) + 1);
            while (map.size() >= 3) {
                map.put(tree[i], map.get(tree[j]) - 1);
                if (map.get(tree[i]) == 0)
                    map.remove(tree[i]);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,2,2};
        FruitBasket f = new FruitBasket();
        System.out.println(f.totalFruit(arr));
    }
}
