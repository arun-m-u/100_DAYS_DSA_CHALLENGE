import java.util.*;
class Solution1{
    public static void main(String[] args){
        String s = "ababcbacadefegdehijhklij";
        int n = s.length();

        int[] last = new int[26];

        for(int i = 0; i < n; i++){
            last[s.charAt(i)-'a'] = i;
        }

        int start = 0;
        int end = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            end = Math.max(last[s.charAt(i)-'a'],end);
            if(i == end){
                res.add(end - start+1);
                start = i+1;
            }
        }
        System.out.print(res);
    }
}