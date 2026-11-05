# Move Zeroes

## Problem Link
[LeetCode - Move Zeroes](https://leetcode.com/problems/move-zeroes/)

---

## Problem Statement

Given an integer array `nums`, move all the zeroes to the end of the array while maintaining the relative order of all non-zero elements.

You must perform this operation **in-place** without making a copy of the array.

## Sample Test Cases

### Example 1
**Input:**
```text
nums = [0, 1, 0, 3, 12]
```
**Output:**
```text
[1, 3, 12, 0, 0]
```

### Example 2
**Input:**
```text
nums = [0]
```
**Output:**
```text
[0]
```

### Example 3
**Input:**
```text
nums = [1, 2, 3, 4, 5]
```
**Output:**
```text
[1, 2, 3, 4, 5]
```

### Example 4
**Input:**
```text
nums = [0, 0, 1]
```
**Output:**
```text
[1, 0, 0]
```

### Example 5
**Input:**
```text
nums = [1, 0, 2, 0, 3, 0, 4]
```
**Output:**
```text
[1, 2, 3, 4, 0, 0, 0]
```

## Constraints

- 1 ≤ nums.length ≤ 10⁴
- -2³¹ ≤ nums[i] ≤ 2³¹ - 1
- `nums[i]` is an integer.