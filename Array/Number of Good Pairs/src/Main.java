import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
        Given an array of integers nums.
        A pair (i,j) is called good if nums[i] == nums[j] and i < j.
        Return the number of good pairs.
     */

    public static void main(String[] args) {

    }

    static public int numIdenticalPairs(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            count += map.get(num) - 1;
        }
        return count;
    }
}
