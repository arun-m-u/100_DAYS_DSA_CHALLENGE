
import java.util.*;

class Solution2 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.length; i++) {
            ans = Math.min(ans, arr[i + m - 1] - arr[i]);
        }

        System.out.print(ans);
    }
}
