# Next Permutation

## Problem Statement

Given an array of integers `nums`, rearrange the numbers into the **next lexicographically greater permutation** of numbers.

If such an arrangement is not possible, rearrange it into the **lowest possible order (ascending order)**.

You must modify the array **in-place** and use only constant extra memory.

## Sample Test Cases

### Example 1

**Input:**
```text
nums = [1, 2, 3]
```

**Output:**
```text
[1, 3, 2]
```

**Explanation:** `[1, 3, 2]` is the next permutation that is lexicographically greater than `[1, 2, 3]`.

### Example 2

**Input:**
```text
nums = [3, 2, 1]
```

**Output:**
```text
[1, 2, 3]
```

**Explanation:** The array is in descending order, so there is no greater permutation. Rearrange it into ascending order, which is the smallest possible permutation.

### Example 3

**Input:**
```text
nums = [1, 1, 5]
```

**Output:**
```text
[1, 5, 1]
```

**Explanation:** `[1, 5, 1]` is the next greater permutation after `[1, 1, 5]`.

### Example 4

**Input:**
```text
nums = [1, 3, 2]
```

**Output:**
```text
[2, 1, 3]
```

**Explanation:** `[2, 1, 3]` is the next permutation that is lexicographically greater than `[1, 3, 2]`.

## Constraints

- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 100`

## Related Topics

- Array
- Two Pointers
- Permutations

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`
