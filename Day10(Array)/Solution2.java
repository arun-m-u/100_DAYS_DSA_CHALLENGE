
import java.util.*;
class Solution2{
    public static void main(String[] args){
        int[] nums = {1,3,2,2,1};
        int n = nums.length;
        int st =0;
        int pk = 0;
        int ed = 0;
        int flag = 0;
        int len = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i+1] > nums[i]){
                if(flag == 0){
                    st = i;
                }
                flag = 1;
            }else if(nums[i+1] < nums[i]){
                if(flag == 1 && nums[i-1] < nums[i]){
                    pk = i;
                    flag = 0;
                }
                ed = i+1;
                if(pk != 0){
                    len = Math.max(len , ed-st+1);
                }
            }else{                   
                flag = 0;
                pk = 0;
            }
        }
        System.out.print(len);
    }
}