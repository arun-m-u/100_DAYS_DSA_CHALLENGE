
import java.util.*;

class Solution1 {
    public static void main() {
        int[] ratings = {1, 3, 2, 5, 4};
        int n = ratings.length;

        // Step 1: Create indices array
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: Sort indices based on ratings
        Arrays.sort(indices, (a, b) -> Integer.compare(ratings[a], ratings[b]));

        // Step 3: Initialize candies array
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Step 4: Process indices in ascending rating order
        for (int idx : indices) {

            // Check left neighbour
            if (idx > 0 && ratings[idx] > ratings[idx - 1]) {
                candies[idx] = Math.max(candies[idx], candies[idx - 1] + 1);
            }

            // Check right neighbour
            if (idx < n - 1 && ratings[idx] > ratings[idx + 1]) {
                candies[idx] = Math.max(candies[idx], candies[idx + 1] + 1);
            }
        }

        // Step 5: Calculate total candies
        int sum = 0;

        for (int c : candies) {
            sum += c;
        }

        System.out.print(sum);
    }
}