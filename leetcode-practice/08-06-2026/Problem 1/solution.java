import java.util.Arrays;
import java.util.HashMap;

// Java (Brute Force) -- time complexity O(n^2)

class solution1 {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}


// Java (Hash Map) -- time complexity O(n)


public class solution {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {
                        map.get(complement),
                        i
                };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(twoSum(
                        new int[] { 2, 7, 11, 15 }, 9)));

        System.out.println(
                Arrays.toString(twoSum(
                        new int[] { 3, 2, 4 }, 6)));

        System.out.println(
                Arrays.toString(twoSum(
                        new int[] { 3, 3 }, 6)));
    }
}

