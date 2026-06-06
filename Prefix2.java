import java.util.*;

public class Prefix2{
    public static void longestSubarraySumK() { 
        int[] arr = new int[]{3, -2, 5, -1, 2, -3, 6, -2, 4};
        int k = 7;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0,max=0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                int len = i-map.get(sum-k);
                max=max<len?len:max;
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        longestSubarraySumK();
    }
}
