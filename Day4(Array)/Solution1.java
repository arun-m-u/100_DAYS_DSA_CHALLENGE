class Solution1{
    public static void main(String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        int n = nums.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += nums[i];
        }
        int res = -1;
        int psum = 0;
        for(int i = 0; i < n ; i++){
           if(psum == total-psum-nums[i]){
            res = i;
            break;
           }
           psum += nums[i];
        }
        System.out.print(res);
    }
}