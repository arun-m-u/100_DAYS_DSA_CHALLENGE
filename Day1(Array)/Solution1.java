import java.util.*;
class Solution1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int l = 0;
        int r = n-1;

        while(l <= r){

            int sum = numbers[l] + numbers[r];

            if(sum > target){
                r--;
            }else if(sum < target){
                l++;
            }else{
                System.out.print((l+1) + " " + (r+1));
                return;
            }

        }
    }
}