class Solution1:
    def main(self):
        nums = [5, 4, 0, 3, 1, 6, 2]

        n = len(nums)
        idx = 0
        ans = 0

        for i in range(n):
            count = 0
            idx = i

            while nums[idx] != -1:
                count += 1

                next_idx = nums[idx]
                nums[idx] = -1
                idx = next_idx

            ans = max(ans, count)

        print(ans)


obj = Solution1()
obj.main()