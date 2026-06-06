import java.util.*;
public class Longestsubstrk {
    public static void main(String[] args) {
        String s="aabcbabad";
        int k=2;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        for (int r=0;r<s.length();r++){
            char curr = s.charAt(r);
            map.put(curr,map.getOrDefault(curr,0)+1);
            
            while(map.size()>k){
                if(map.get(s.charAt(l))==1){
                    map.remove(s.charAt(l));
                }else{
                    map.put(s.charAt(1),map.get(s.charAt(l))-1);
                }
                l++;

            }
            if(map.size()<=k){
                max = max<(r-l+1)? r-l+1:max;
            }

        }
        System.out.println(max);
    }
}
