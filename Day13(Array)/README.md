# Gas Station

## Problem Statement

There are `n` gas stations arranged in a circular route. At the `i-th` gas station, you can get `gas[i]` amount of gas.

You have a car with an unlimited gas tank, and it costs `cost[i]` amount of gas to travel from the `i-th` gas station to the next `(i+1)-th` gas station.

You begin the journey with an empty gas tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once in the clockwise direction. Otherwise, return `-1`.

If there exists a solution, it is guaranteed to be unique.

---

## Sample Test Cases

### Example 1

**Input:**
```text
gas = [1,2,3,4,5]
cost = [3,4,5,1,2]
```

**Output:**
```text
3
```

**Explanation:**

Starting at station 3 (0-based indexing):

- Collect 4 units of gas. Tank = 4.
- Travel to station 4. Tank = 3.
- Collect 5 units of gas. Tank = 8.
- Travel to station 0. Tank = 6.
- Collect 1 unit of gas. Tank = 7.
- Travel to station 1. Tank = 4.
- Collect 2 units of gas. Tank = 6.
- Travel to station 2. Tank = 1.
- Collect 3 units of gas. Tank = 4.
- Travel back to station 3. Tank = 0.

The complete circuit is possible by starting at index 3.

### Example 2

**Input:**
```text
gas = [2,3,4]
cost = [3,4,3]
```

**Output:**
```text
-1
```

**Explanation:**

The total amount of gas available is 9, while the total cost required is 10.

Since the available gas is less than the required cost, completing the circuit is impossible.

### Example 3

**Input:**
```text
gas = [5,1,2,3,4]
cost = [4,4,1,5,1]
```

**Output:**
```text
4
```

**Explanation:**

Starting at station 4 allows the car to collect enough gas to complete the entire circular route.

---

## Constraints

```text
1 <= n <= 10^5
gas.length == n
cost.length == n
0 <= gas[i], cost[i] <= 10^4
```

---

## Pattern

- Greedy
- Circular Array