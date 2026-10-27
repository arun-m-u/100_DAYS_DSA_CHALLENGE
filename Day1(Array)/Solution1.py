n = int(input("Enter array size: "))
numbers = []
for i in range(n):
    numbers.append(int(input()))
target = int(input())
l = 0
r = n - 1
while(l <= r):
    sum = numbers[l] + numbers[r]
    if sum == target:
        print("Target found at index:", l+1, r+1)
        break
    elif sum < target:
        l = l+1
    else:
        r = r-1
else:
    print("Target not found in the array.")