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
        // Shift non-zero values as far forward as possible
        // Fill remaining space with zeros
        int nonZeroIndex = 0;

        for (int i=0; i<nums.length; i++){
            if(nums[i] != 0)
                nums[nonZeroIndex++] = nums[i];
        }

        for (int i=nonZeroIndex; i<nums.length; i++)
            nums[i] = 0;



        // have two pointers i and j
        // where i(index 0 -> length-2) and j(index i+1 -> length-1)
        // if nums[i] == 0 -> let nums[j] find a non-zero element and switch.
        /*if(nums.length > 1){
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
        }*/
    }
}
