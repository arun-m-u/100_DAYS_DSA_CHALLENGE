# Minimum Number of Arrows to Burst Balloons

## Problem Statement

There are some spherical balloons taped onto a flat wall. Each balloon is represented by a 2D integer array `points`, where `points[i] = [x_start, x_end]` represents the horizontal diameter of a balloon.

You can shoot arrows vertically upwards from different points along the X-axis. An arrow shot at position `x` will burst every balloon whose horizontal range includes `x`.

Return the **minimum number of arrows** required to burst all the balloons.

**Note:** A balloon can be burst if the arrow's position is between its start and end coordinates, including both endpoints.

---

## Sample Test Cases

### Example 1

**Input:**
```text
points = [[10,16],[2,8],[1,6],[7,12]]
```

**Output:**
```text
2
```

**Explanation:**

- Shoot an arrow at x = 6 to burst `[2,8]` and `[1,6]`.
- Shoot another arrow at x = 12 to burst `[10,16]` and `[7,12]`.
- Minimum arrows required = 2.

### Example 2

**Input:**
```text
points = [[1,2],[3,4],[5,6],[7,8]]
```

**Output:**
```text
4
```

**Explanation:**

No two balloons overlap. Each balloon requires a separate arrow.

### Example 3

**Input:**
```text
points = [[1,10],[2,3],[4,5]]
```

**Output:**
```text
2
```

**Explanation:**

- Shoot an arrow at x = 3 to burst `[1,10]` and `[2,3]`.
- Shoot another arrow at x = 5 to burst `[4,5]`.
- Minimum arrows required = 2.

### Example 4

**Input:**
```text
points = [[1,6],[2,8],[7,12],[10,16]]
```

**Output:**
```text
2
```

**Explanation:**

- Shoot an arrow at x = 6 to burst `[1,6]` and `[2,8]`.
- Shoot another arrow at x = 12 to burst `[7,12]` and `[10,16]`.
- Minimum arrows required = 2.

---

## Constraints

```text
1 <= points.length <= 10^5
points[i].length == 2
-2^31 <= x_start < x_end <= 2^31 - 1
```

---

## Pattern

- Greedy
- Intervals
- Sorting