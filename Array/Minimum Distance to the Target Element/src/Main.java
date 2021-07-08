import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int getMinDistance(int[] nums, int target, int start){
        Set<Integer> indices = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                indices.add(i);
            }
        }

        //Object obj = Collections.min(indices);
        int ans = Integer.MAX_VALUE;
        for(Integer index : indices){
            if(Math.abs(index-start) < ans)
                ans = Math.abs(index-start);
        }

        return ans;


    }
}
