import java.util.*;
class Solution1{
    public static void main(String[] args){
        int[] nums = {5, 4, 3, 2, 1};
        int n = nums.length;

        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
                st.push(i);
            }
        }
        int max = 0;
        for(int i = n-1; i >= 0; i--){
            if(st.isEmpty()){
                break;
            }
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
               max = Math.max(max,i - st.peek());
                st.pop();
            }
        }
        System.out.print(max);
    }
}