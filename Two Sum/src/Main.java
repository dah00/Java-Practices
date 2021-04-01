import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }


    private static int[] twoSum(int[] nums, int target) {

        // Better time complexity O(n) using hashtable
        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[]{i, map.get(complement)};
        }

        throw new IllegalArgumentException("No two sum");*/



    // Brute force O(n^2)
    /*

		for (int i = 0; i < nums.length; i++ )
			for(int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					return new int[]{i,j};
				}
		    }
        throw new IllegalArgumentException("No two sum solution");
     */
    }
}
