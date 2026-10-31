import java.util.*;

class Solution1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 1, 4, 1};

        int n = nums.length;

        Integer can1 = null, can2 = null;

        int c1 = 0, c2 = 0;

        // First traversal: Find two candidates
        for (int i = 0; i < n; i++) {

            if (can1 != null && nums[i] == can1) {
                c1++;
            }
            else if (can2 != null && nums[i] == can2) {
                c2++;
            }
            else if (c1 == 0) {
                can1 = nums[i];
                c1 = 1;
            }
            else if (c2 == 0) {
                can2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }

        // Second traversal: Verify frequencies
        c1 = 0;
        c2 = 0;

        for (int i = 0; i < n; i++) {

            if (can1 != null && nums[i] == can1) {
                c1++;
            }

            if (can2 != null && nums[i] == can2) {
                c2++;
            }
        }

        // Store majority elements
        List<Integer> res = new ArrayList<>();

        if (c1 > n / 3) {
            res.add(can1);
        }

        if (can2 != null && !can2.equals(can1) && c2 > n / 3) {
            res.add(can2);
        }

        System.out.println(res);
    }
}