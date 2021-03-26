public class Main {

    public static void main(String[] args) {
	    int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        // [1, 2, 3, 1]
        //  i        j
        for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            while(j<nums.length){
                if(nums[i] == nums[j])
                    return true;
                j++;
            }
        }
        return false;
    }
}
