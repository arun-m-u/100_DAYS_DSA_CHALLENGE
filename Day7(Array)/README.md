# Array Nesting

## Problem Link

[LeetCode 565 – Array Nesting](https://leetcode.com/problems/array-nesting/)

## Problem Statement

You are given an integer array `nums` of length `n`. The array is a **permutation** of the integers from `0` to `n - 1`, meaning every number in this range appears exactly once.

Starting from an index `k`, build a set `S[k]` by following these steps:

1. Start with the value `nums[k]` and add it to the set.
2. Use that value as the next index and add the value at that index.
3. Continue following the values as indexes.
4. Stop when an index would lead to a value that has already been included in the set.

Return the maximum size of `S[k]` among all possible starting indexes `k`.

## Examples

### Example 1

**Input:**
```text
nums = [5, 4, 0, 3, 1, 6, 2]
```

**Output:**
```text
4
```

**Explanation:**

Starting from index `0`:

- `nums[0] = 5`
- `nums[5] = 6`
- `nums[6] = 2`
- `nums[2] = 0`
- `nums[0] = 5` — already visited, so stop.

The set is `{5, 6, 2, 0}`, and its size is `4`.

### Example 2

**Input:**
```text
nums = [0, 1, 2]
```

**Output:**
```text
1
```

**Explanation:**

Every index points to itself. Each set contains one element, so the maximum size is `1`.

### Example 3

**Input:**
```text
nums = [1, 2, 0, 4, 3]
```

**Output:**
```text
3
```

**Explanation:**

- Starting at index `0`: `0 → 1 → 2 → 0`, giving a set of size `3`.
- Starting at index `3`: `3 → 4 → 3`, giving a set of size `2`.

The maximum set size is `3`.

## Additional Test Cases

| Input | Expected Output |
|---|---:|
| `[5, 4, 0, 3, 1, 6, 2]` | `4` |
| `[0, 1, 2]` | `1` |
| `[1, 2, 0, 4, 3]` | `3` |
| `[1, 0]` | `2` |
| `[2, 0, 1]` | `3` |
| `[3, 2, 1, 0]` | `2` |

## Pattern

- Array
- Visited
- Cycle Detection
- DFS (cycle traversal)

## Approach

Treat the array as a permutation made up of separate cycles.

1. Iterate through every index.
2. If the current index has already been visited, skip it.
3. Otherwise, follow the cycle starting from that index.
4. Before moving to the next index, save the next value.
5. Mark the current position as visited by replacing its value with `-1`.
6. Count the elements in the cycle and update the maximum count.

Because every element belongs to exactly one cycle, each index needs to be visited only once.

## Complexity Analysis

- **Time Complexity:** `O(n)` — each array index is visited at most once.
- **Auxiliary Space Complexity:** `O(1)` — the solution marks visited elements in the input array and uses only a few variables.

## Important Note

The in-place approach modifies the original `nums` array by replacing visited values with `-1`. The input is guaranteed to be a permutation of values from `0` to `n - 1`, so `-1` can safely be used as a visited marker.
