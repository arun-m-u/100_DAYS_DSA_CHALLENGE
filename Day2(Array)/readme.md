Problem 1: Product of Array Except Self
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
-------------------------------------------------------------------------------------------------------------------------------------------------
Problem 2: Sort Colors
Problem Statement:

You are given an integer array nums consisting of 0, 1, and 2, where:
- 0 represents red.
- 1 represents white.
- 2 represents blue.
Sort the array in-place so that objects of the same color are adjacent, in the order 0, 1, and 2.

You must solve this problem without using any built-in sorting function.

nums = [2,0,2,1,1,0]
[0,0,1,1,2,2]

nums = [2,0,1]
[0,1,2]

nums = [0]
[0]