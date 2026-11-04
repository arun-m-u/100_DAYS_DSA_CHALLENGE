class Solution1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int n = nums.length;
        int size = n - k;

        // Calculate total sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Find minimum sum of a window of size n-k
        int msum = 0;
        int st = 0;
        int ed = 0;

        // Calculate initial window sum
        while (ed < size) {
            msum += nums[ed++];
        }

        int minSum = msum;

        // Slide the window
        while (ed < n) {
            int nsum = msum - nums[st] + nums[ed];

            st++;
            ed++;

            msum = nsum;
            minSum = Math.min(minSum, msum);
        }

        // Calculate maximum points
        int ans = sum - minSum;

        System.out.println(ans);
    }
}