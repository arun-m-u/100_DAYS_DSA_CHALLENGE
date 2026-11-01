import java.util.*;
class Solution1{
    public static void main(String[] args){
        int[] nums = {5,4,0,3,1,6,2};
        int n = nums.length;
        int idx = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){
             int count = 0;
             idx = i;
            while(nums[idx] != -1){
                count++;
                int next = nums[idx];
                nums[idx] = -1;
                idx = next;
            }
            ans = Math.max(ans,count);
        }
        System.out.print(ans);
    }
}