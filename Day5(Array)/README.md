# Partition Labels

**Difficulty:** Medium  
**Topic:** Greedy Algorithm, Strings, Two Pointers

## Problem Statement

You are given a string `S` consisting of lowercase English letters.

Your task is to partition the string into as many parts as possible so that each letter appears in at most one part.

In other words, each character must belong to only one partition. If a character appears multiple times, all its occurrences must be present in the same partition.

Return a list containing the length of each partition.

The partitions must maintain the original order of characters in the string.

## Constraints

- `1 <= S.length <= 500`
- `S` consists of lowercase English letters (`a-z`).
- The answer must contain the maximum possible number of partitions.

## Sample Test Cases

### Test Case 1

**Input:**
```text
S = "ababcbacadefegdehijhklij"
```

**Output:**
```text
[9, 7, 8]
```

**Explanation:**
The string can be partitioned as:

`ababcbaca | defegde | hijhklij`

Partition lengths are 9, 7, and 8.

### Test Case 2

**Input:**
```text
S = "eccbbbbdec"
```

**Output:**
```text
[10]
```

**Explanation:**
All characters must belong to the same partition because their occurrences overlap.

### Test Case 3

**Input:**
```text
S = "abc"
```

**Output:**
```text
[1, 1, 1]
```

**Explanation:**
Every character is unique, so each character can form an individual partition.

### Test Case 4

**Input:**
```text
S = "caedbdedda"
```

**Output:**
```text
[1, 9]
```

**Explanation:**
The string can be partitioned as:

`c | aedbdedda`

### Test Case 5

**Input:**
```text
S = "aaabbbccc"
```

**Output:**
```text
[3, 3, 3]
```

**Explanation:**
The string can be partitioned as:

`aaa | bbb | ccc`

### Test Case 6

**Input:**
```text
S = "abac"
```

**Output:**
```text
[3, 1]
```

**Explanation:**
The string can be partitioned as:

`aba | c`

All occurrences of the character `a` belong to the same partition.