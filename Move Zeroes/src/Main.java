public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    /**
     * Given an integer array nums, move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements.
     * ex: Input: nums = [0,1,0,3,12]
     *     Output: [1,3,12,0,0]
     * @param nums
     */
    private static void moveZeroes(int[] nums){
        if(nums.length > 1){
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] == 0){
                    int j = i+1;
                    while(nums[j] == 0 && j<nums.length-1)
                        j++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
