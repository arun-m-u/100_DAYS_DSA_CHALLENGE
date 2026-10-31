# Majority Element II

## Problem Link
[LeetCode 229 - Majority Element II](https://leetcode.com/problems/majority-element-ii/)

---

## Problem Statement

Given an integer array `nums` of size `n`, find all elements that appear **more than ⌊n/3⌋ times** in the array.

Return the answer in any order.

### Important Conditions

- An element is called a majority element if its frequency is strictly greater than `n/3`.
- There can be at most **two majority elements** in an array.
- If no majority element exists, return an empty list `[]`.

---

## Sample Test Cases

### Example 1

**Input:**
```java
nums = [3, 2, 3]
```

**Output:**
```java
[3]
```

**Explanation:**
- Array size = 3
- Threshold = 3/3 = 1
- Element 3 appears 2 times.
- Since 2 > 1, element 3 is the majority element.

---

### Example 2

**Input:**
```java
nums = [1]
```

**Output:**
```java
[1]
```

**Explanation:**
- Array size = 1
- Threshold = 1/3 = 0
- Element 1 appears 1 time.
- Since 1 > 0, element 1 is the majority element.

---

### Example 3

**Input:**
```java
nums = [1, 2]
```

**Output:**
```java
[1, 2]
```

**Explanation:**
- Array size = 2
- Threshold = 2/3 = 0
- Both elements appear once.
- Since both frequencies are greater than 0, both are majority elements.

---

### Example 4

**Input:**
```java
nums = [1, 2, 3, 1, 2, 1, 4, 1]
```

**Output:**
```java
[1]
```

**Explanation:**
- Array size = 8
- Threshold = 8/3 = 2
- Element 1 appears 4 times.
- Element 2 appears 2 times.
- Element 3 appears 1 time.
- Element 4 appears 1 time.
- Only element 1 appears more than 2 times.

---

### Example 5

**Input:**
```java
nums = [1, 2, 3, 4, 5, 6]
```

**Output:**
```java
[]
```

**Explanation:**
- Array size = 6
- Threshold = 6/3 = 2
- Every element appears once.
- No element appears more than 2 times.

---

## Pattern

**Extended Boyer-Moore Voting Algorithm**

---

## Approach

1. Maintain two candidates (`c1`, `c2`) and two counters (`cnt1`, `cnt2`).
2. Traverse the array and identify two possible majority candidates.
3. If an element matches a candidate, increment its counter.
4. If a candidate's counter becomes zero, assign a new candidate.
5. If the element matches neither candidate and both counters are non-zero, decrement both counters.
6. Traverse the array again to verify the actual frequencies.
7. Add candidates whose frequency is greater than `n/3` to the result list.

---

## Time Complexity

`O(n)` - Two traversals of the array.

## Space Complexity

`O(1)` - Constant auxiliary space, excluding the result list.

---

## Key Learning

- Majority Element I: Frequency > n/2 → At most 1 candidate.
- Majority Element II: Frequency > n/3 → At most 2 candidates.
- Generalized Boyer-Moore: Frequency > n/k → At most k-1 candidates.
