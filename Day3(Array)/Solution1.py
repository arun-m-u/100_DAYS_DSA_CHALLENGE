def next_permutation(nums):
    n = len(nums)

    # Step 1: Find the pivot from the right
    i = n - 2

    while i >= 0 and nums[i] >= nums[i + 1]:
        i -= 1

    # Step 2: Find the next greater element
    if i >= 0:
        j = n - 1

        while nums[j] <= nums[i]:
            j -= 1

        # Step 3: Swap the pivot and the next greater element
        nums[i], nums[j] = nums[j], nums[i]

    # Step 4: Reverse the suffix
    left = i + 1
    right = n - 1

    while left < right:
        nums[left], nums[right] = nums[right], nums[left]
        left += 1
        right -= 1


# Main program
nums = [1, 4, 7, 9, 8, 6, 5, 3, 2, 1, 0]

next_permutation(nums)

print(nums)