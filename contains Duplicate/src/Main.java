import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {

        

        // Second try
        // Better time complexity by sorting the array first
        // then comparing two consecutive elements sequentially
/*        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;*/


        // Works but exceed time limit
        /*for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            while(j<nums.length){
                if(nums[i] == nums[j])
                    return true;
                j++;
            }
        }
        return false;*/
    }
}
