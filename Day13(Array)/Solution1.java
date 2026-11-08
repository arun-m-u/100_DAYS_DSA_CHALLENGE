
import java.util.*;

class Solution1 {
    public static void main(String[] args) {

        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        int n = gas.length;

        int total = 0;
        int tank = 0;
        int start = 0;

        // Traverse all gas stations
        for (int i = 0; i < n; i++) {

            // Calculate remaining gas after travelling
            int diff = gas[i] - cost[i];

            // Update current tank and total gas balance
            tank += diff;
            total += diff;

            // If tank becomes negative, change starting station
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        // Check whether completing the circuit is possible
        if (total < 0) {
            System.out.println(-1);
        } else {
            System.out.println(start);
        }
    }
}
