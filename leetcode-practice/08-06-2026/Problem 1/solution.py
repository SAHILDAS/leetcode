# Python (Brute Force) -- O(n^2)

class Solution:
    def twoSum(self, nums, target):

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):

                if nums[i] + nums[j] == target:
                    return [i, j]
                

# Python (Hash Map) -- optimal solution O(n)

# Two Sum - Optimal Solution (O(n))

def two_sum(nums, target):

    hashmap = {}

    for i, num in enumerate(nums):

        complement = target - num

        if complement in hashmap:
            return [hashmap[complement], i]

        hashmap[num] = i

    return []


# Test Cases
print(two_sum([2, 7, 11, 15], 9))
print(two_sum([3, 2, 4], 6))
print(two_sum([3, 3], 6))