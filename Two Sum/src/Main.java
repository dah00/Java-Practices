import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }


    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] sumArray = new int[2];

        for (int i=0; i<nums.length; i++)
            map.put(i, (target-nums[i]));
        for (int i=0; i<nums.length; i++){
            if (map.containsValue(nums[i])){
                sumArray[0] = (int)getKeyByValue(map, nums[i]);
                break;
            }
        }
        return sumArray;
    }

    private static Object getKeyByValue(Map<Integer, Integer> map, int value) {
        for (Integer key : map.keySet()) {
            if (value == map.get(key))
                return key;
        }
        return null;
    }

    /*
    		int[] results = new int[2];
		for (int i = 0; i < nums.length; i++ )
			for(int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					results[0] = i;
					results[1] = j;
				}
		    }
        return results;
     */
}
