class Solution1{
    public static void main(String[] args){
        int[] nums = {2,0,1};
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int flag = 1;

        for(int i = 0; i < n-2; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(max > nums[i+2]){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.print("true");
        }else{
             System.out.print("false");
        }
    }
}