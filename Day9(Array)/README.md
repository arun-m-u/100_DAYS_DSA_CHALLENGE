# Maximum Width Ramp

## Problem Link
[LeetCode - Maximum Width Ramp](https://leetcode.com/problems/maximum-width-ramp/)

## Problem Statement

You are given an integer array `nums`.

A ramp is a pair of indices `(i, j)` where:

- `i < j`
- `nums[i] <= nums[j]`

The width of a ramp is calculated as `j - i`.

Your task is to return the **maximum width of a ramp** in the given array.

If no valid ramp exists, return `0`.

## Sample Test Cases

### Example 1

**Input:**
```text
nums = [6, 0, 8, 2, 1, 5]
```

**Output:**
```text
4
```

**Explanation:**
The maximum width ramp is `(1, 5)`.
Width = `5 - 1 = 4`.

### Example 2

**Input:**
```text
nums = [9, 8, 1, 0, 1, 9, 4, 0, 4, 1]
```

**Output:**
```text
7
```

**Explanation:**
The maximum width ramp is `(2, 9)`.
Width = `9 - 2 = 7`.

### Example 3

**Input:**
```text
nums = [5, 4, 3, 2, 1]
```

**Output:**
```text
0
```

**Explanation:**
No valid ramp exists.

### Example 4

**Input:**
```text
nums = [1, 2, 3, 4, 5]
```

**Output:**
```text
4
```

**Explanation:**
The maximum width ramp is `(0, 4)`.
Width = `4 - 0 = 4`.

### Example 5

**Input:**
```text
nums = [2, 2]
```

**Output:**
```text
1
```

**Explanation:**
The maximum width ramp is `(0, 1)`.
Width = `1 - 0 = 1`.

## Constraints

```text
2 <= nums.length <= 50000
0 <= nums[i] <= 50000
```