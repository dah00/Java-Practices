import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
	    System.out.println(Arrays.toString(nums));

    }
    // My approach
    private static void rotate(int[] nums, int k){
        if(nums.length>1){
            k %= nums.length;
            int i = 1;
            while(i <= k){
                int temp = nums[0];
                nums[0] = nums[nums.length-1];
                for(int j=nums.length-2; j>=1; j--)
                    nums[j+1] = nums[j];
                nums[1] = temp;
                i++;
            }
        }
    }

    // Best approach
    /*
          public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
          }
          public void reverse(int[] nums, int start, int end) {
            while (start < end) {
              int temp = nums[start];
              nums[start] = nums[end];
              nums[end] = temp;
              start++;
              end--;
            }
          }
     */
}
