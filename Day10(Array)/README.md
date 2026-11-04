# Maximum Points You Can Obtain from Cards

## Problem Link
https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

---

## Problem Statement

There are several cards arranged in a row, and each card has an associated number of points. The points are given in an integer array `nums`.

In one step, you can take one card from either the beginning or the end of the row. You must take exactly `k` cards.

Your goal is to maximize the total number of points collected.

Return the maximum score you can obtain.

---

## Input Format

- An integer array `nums` representing the points on each card.
- An integer `k` representing the number of cards to select.

## Output Format

- Return an integer representing the maximum points obtainable.

---

## Sample Test Cases

### Example 1

**Input:**
```text
nums = [1, 2, 3, 4, 5, 6, 1]
k = 3
```

**Output:**
```text
12
```

**Explanation:**
Select three cards from the right end: 1, 6, and 5.

Maximum score = 1 + 6 + 5 = 12.

### Example 2

**Input:**
```text
nums = [2, 2, 2]
k = 2
```

**Output:**
```text
4
```

**Explanation:**
Select two cards from either end.

Maximum score = 2 + 2 = 4.

### Example 3

**Input:**
```text
nums = [9, 7, 7, 9, 7, 7, 9]
k = 7
```

**Output:**
```text
55
```

**Explanation:**
All cards must be selected.

Maximum score = 55.

### Example 4

**Input:**
```text
nums = [1, 1000, 1]
k = 1
```

**Output:**
```text
1
```

**Explanation:**
You can select only one card from either end. Both end cards have 1 point.

---

## Constraints

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^4`
- `1 <= k <= nums.length`