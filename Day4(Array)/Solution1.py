nums = [1, 7, 3, 6, 5, 6]
n = len(nums)

# Step 1: Calculate total sum
total = 0
for i in range(n):
    total += nums[i]

res = -1
psum = 0

# Step 2: Find the equilibrium index
for i in range(n):
    if psum == total-psum- nums[i]:
        res = i
        break
    psum += nums[i]

print(res)