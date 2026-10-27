
nums = [1, 2, 3, 4]
n = len(nums)
res = [0] * n

# Calculate prefix products
res[0] = 1
for i in range(1, n):
    res[i] = res[i - 1] * nums[i - 1]

# Calculate suffix products
r = 1
for i in range(n - 1, -1, -1):
    res[i] = res[i] * r
    r = r * nums[i]

print(res)
