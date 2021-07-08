import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int getMinDistance(int[] nums, int target, int start){
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans = Math.min(ans, Math.abs(i-start));
            }
        }

        return ans;


    }
}
