# 1.Equilibrium Index

## Problem Statement

Given an integer array `nums`, find the **equilibrium index** (also known as the **pivot index**) where the sum of all elements strictly to the left of the index is equal to the sum of all elements strictly to the right.

Return the **leftmost equilibrium index** if one exists. If no such index exists, return `-1`.

The element at the equilibrium index is not included in either the left sum or the right sum.

## Sample Test Cases

### Example 1

**Input:**
```text
nums = [1, 7, 3, 6, 5, 6]
```

**Output:**
```text
3
```

**Explanation:**

At index `3`, the element is `6`.

- Left sum: `1 + 7 + 3 = 11`
- Right sum: `5 + 6 = 11`

Both sums are equal, so the equilibrium index is `3`.

### Example 2

**Input:**
```text
nums = [1, 2, 3]
```

**Output:**
```text
-1
```

**Explanation:** There is no index where the sum of the elements to the left equals the sum of the elements to the right.

### Example 3

**Input:**
```text
nums = [2, 1, -1]
```

**Output:**
```text
0
```

**Explanation:** At index `0`, the left sum is `0` because there are no elements to the left. The right sum is `1 + (-1) = 0`, so index `0` is the equilibrium index.

### Example 4

**Input:**
```text
nums = [0, 0, 0, 0]
```

**Output:**
```text
0
```

**Explanation:** The leftmost index is `0`. The left sum is `0`, and the right sum is also `0`.

## Constraints

- `1 <= nums.length <= 10^4`
- `-1000 <= nums[i] <= 1000`

## Pattern

- Prefix Sum

## Approach

1. Calculate the total sum of the array.
2. Initialize `leftSum = 0`.
3. Traverse the array from left to right.
4. At each index, calculate the right sum as `totalSum - leftSum - nums[i]`.
5. If `leftSum == rightSum`, return the current index.
6. Otherwise, add the current element to `leftSum` and continue.
7. If no equilibrium index is found, return `-1`.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`


-------------------------------------------------------------------------------------------------------------------------------------


# 2. Chocolate Distribution Problem

## Problem Statement

You are given an array `arr`, where `arr[i]` represents the number of chocolates in the `i`-th packet. There are `m` students, and each student must receive exactly one packet.

Choose `m` packets so that the difference between the maximum and minimum number of chocolates among the chosen packets is as small as possible. Return this minimum difference.

**Note:** The Java solution below returns `0` if no valid window is found (for example, when `m > arr.length`). If your platform expects `-1` for invalid input, adjust the return value to match its requirements.

## Pattern

- Sorting
- Sliding Window

## Sample Test Cases

### Example 1

**Input**
```text
arr = [7, 3, 2, 4, 9, 12, 56]
m = 3
```

**Output**
```text
2
```

**Explanation:** After sorting, the array is `[2, 3, 4, 7, 9, 12, 56]`. Choosing packets with `2`, `3`, and `4` chocolates gives a difference of `4 - 2 = 2`, which is the minimum.

### Example 2

**Input**
```text
arr = [3, 4, 1, 9, 56, 7, 9, 12]
m = 5
```

**Output**
```text
6
```

**Explanation:** After sorting, the array is `[1, 3, 4, 7, 9, 9, 12, 56]`. One best group is `[3, 4, 7, 9, 9]`, giving a difference of `9 - 3 = 6`.

### Example 3

**Input**
```text
arr = [10, 20, 30]
m = 1
```

**Output**
```text
0
```

**Explanation:** A group with one packet has the same maximum and minimum value, so the difference is `0`.

### Example 4

**Input**
```text
arr = [5, 8]
m = 3
```

**Output**
```text
0
```

**Explanation:** There are fewer packets than students, so the provided Java implementation finds no valid window and returns `0`.

## Approach

1. Sort the array in ascending order.
2. Consider every consecutive window of size `m`.
3. For each window, calculate `arr[i + m - 1] - arr[i]`.
4. Keep the smallest difference and return it.

After sorting, consecutive windows are enough to check because each window's smallest and largest values are at its ends.

## Java Solution

```java
import java.util.*;

class Solution {
    public int findMinDiff(int[] arr, int m) {
        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.length; i++) {
            ans = Math.min(ans, arr[i + m - 1] - arr[i]);
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
```

## Complexity Analysis

- **Time Complexity:** `O(n log n)` for sorting and `O(n)` for scanning windows. Overall: `O(n log n)`.
- **Auxiliary Space Complexity:** `O(1)` for the window scan, excluding any internal space used by the sorting implementation.
