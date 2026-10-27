Problem: Product of Array Except Self
Problem Statement
Given an integer array nums, return an array res such that res[i] is equal to the product of all the elements of nums except nums[i].

Important constraints:
- The product of all elements except the current element must be calculated without using division.
- The solution should run in \(O(n)\) time complexity.
- The output array should contain the product for each index.

nums = [1, 2, 3, 4]
[24, 12, 8, 6]

nums = [ -1, 1, 0, -3, 3 ]
[0, 0, 9, 0, 0]

nums = [2, 5]
[5, 2]