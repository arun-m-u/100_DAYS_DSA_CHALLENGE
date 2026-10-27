import java.util.*;
class Solution2{
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low++,mid++);
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high--);
            }
        }

        System.out.print(Arrays.toString(nums));
    }
    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}