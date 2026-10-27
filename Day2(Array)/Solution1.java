import java.util.*;
class Main{
    public static void main(){
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] res = new int[n];
        
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int r = 1;

        for(int i = n-1; i >= 0; i--){
            res[i] = res[i]*r;
            r = r*nums[i];
        }

        System.out.print(Arrays.toString(res));
    }
}