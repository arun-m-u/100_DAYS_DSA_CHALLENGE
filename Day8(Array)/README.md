# Global and Local Inversions

## Problem Link
[LeetCode 775 – Global and Local Inversions](https://leetcode.com/problems/global-and-local-inversions/)

---

## Pattern
- Arrays
- Permutation Properties
- Prefix Maximum

---

## Problem Statement

You are given an integer array `nums` of length `n`, which is a permutation of numbers from `0` to `n - 1`.

There are two types of inversions:

**1. Global Inversion**

A pair of indices `(i, j)` is called a global inversion if:

- `0 <= i < j < n`
- `nums[i] > nums[j]`

**2. Local Inversion**

A pair of indices `(i, i + 1)` is called a local inversion if:

- `0 <= i < n - 1`
- `nums[i] > nums[i + 1]`

Your task is to determine whether the number of global inversions is equal to the number of local inversions.

Return `true` if both counts are equal. Otherwise, return `false`.

---

## Examples

### Example 1

**Input:**
```text
nums = [1, 0, 2]
```

**Output:**
```text
true
```

**Explanation:**

- Global inversions: (1, 0) → 1
- Local inversions: (1, 0) → 1

Both counts are equal.

### Example 2

**Input:**
```text
nums = [1, 2, 0]
```

**Output:**
```text
false
```

**Explanation:**

- Global inversions: (1, 0), (2, 0) → 2
- Local inversions: (2, 0) → 1

Both counts are not equal.

### Example 3

**Input:**
```text
nums = [0, 1, 2, 3]
```

**Output:**
```text
true
```

**Explanation:**

- Global inversions: 0
- Local inversions: 0

Both counts are equal.

### Example 4

**Input:**
```text
nums = [2, 0, 1]
```

**Output:**
```text
false
```

**Explanation:**

- Global inversions: (2, 0), (2, 1) → 2
- Local inversions: (2, 0) → 1

Both counts are not equal.

### Example 5

**Input:**
```text
nums = [0, 2, 1, 3]
```

**Output:**
```text
true
```

**Explanation:**

- Global inversions: (2, 1) → 1
- Local inversions: (2, 1) → 1

Both counts are equal.

---

## Constraints

- `1 <= nums.length <= 100000`
- `0 <= nums[i] < nums.length`
- All integers in `nums` are unique.

---

## Approach

**Optimized Approach – Prefix Maximum**

1. Initialize a variable `max` with the smallest possible integer.
2. Traverse the array from index `0` to `n - 3`.
3. Update `max` to maintain the maximum element encountered so far.
4. Compare `max` with the element at index `i + 2`.
5. If `max > nums[i + 2]`, a non-local global inversion exists. Return `false`.
6. If no such inversion is found, return `true`.

---

## Complexity Analysis

| Complexity | Value |
|---|---|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

## Key Learning

Every local inversion is also a global inversion, but every global inversion is not necessarily a local inversion.

The Prefix Maximum approach helps identify non-local inversions efficiently without counting every pair.
