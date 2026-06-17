// JavaScript (Brute Force) -- time complexity O(n^2)


function twoSum1(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }
}


// JavaScript (Hash Map) -- optimal solution O(n)


// Two Sum - Optimal Solution (O(n))

function twoSum2(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];

        if (map.has(complement)) {
            return [map.get(complement), i];
        }

        map.set(nums[i], i);
    }

    return [];
}

// Test Cases
console.log(twoSum2([2, 7, 11, 15], 9)); // [0,1]
console.log(twoSum2([3, 2, 4], 6));      // [1,2]
console.log(twoSum2([3, 3], 6));         // [0,1]

