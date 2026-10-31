def majorityElement(nums):

    n = len(nums)

    can1 = None
    can2 = None

    c1 = 0
    c2 = 0

    # Step 1: Find two possible candidates
    for num in nums:

        if can1 is not None and num == can1:
            c1 += 1

        elif can2 is not None and num == can2:
            c2 += 1

        elif c1 == 0:
            can1 = num
            c1 = 1

        elif c2 == 0:
            can2 = num
            c2 = 1

        else:
            c1 -= 1
            c2 -= 1

    # Step 2: Reset counters
    c1 = 0
    c2 = 0

    # Step 3: Verify actual frequencies
    for num in nums:

        if can1 is not None and num == can1:
            c1 += 1

        if can2 is not None and num == can2:
            c2 += 1

    # Step 4: Store majority elements
    res = []

    if c1 > n // 3:
        res.append(can1)

    if can2 is not None and can2 != can1 and c2 > n // 3:
        res.append(can2)

    return res


# Driver code
nums = [1, 2, 3, 1, 2, 1, 4, 1]

print(majorityElement(nums))