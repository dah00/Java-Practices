import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        /*
            Second try O(n^2)
            [-4, -1, 1, 2,]
             ^    ^     ^
             i   low   high

             if (sum < target) increment low
             if (sum > target) decrement high
         */
        int threeSum = nums[0] + nums[1] + nums[2];
        if (threeSum == target)
            return threeSum;
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            int low = i+1, high = nums.length-1;
            while(low!=high){
                int sum = nums[i] + nums[low] + nums[high];
                int difference = Math.abs(sum-target);
                if (difference == 0) {
                    return sum;
                }
                if (difference < Math.abs(target-threeSum))
                    threeSum = sum;
                if (sum<target)
                    low++;
                else
                    high--;
            }


        }

        return threeSum;








        // [-1, 2, 1, -4]       target = 1
        // Sort the array in ascending order
        // [-4, -1, 1, 2]
        //   ^   ^     ^
        // put the sum of the 3 elements in an variable threeSum
        // point at 3 elements of the array.
        // if the different of threeSum from target is zero then return threeSum
        // else the second nested loop iterate until length-1
        // if threeSum-target<threeSum
        // threeSum = threemSum
        // if threeSum-target = 0
        // return threeSum


        /*
            First try brute force
            O(n^3)
         */
/*        Arrays.sort(nums);
        int threeSum = nums[0] + nums[1] + nums[2];
        if (threeSum-target == 0)
            return threeSum;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    int difference = Math.abs(temp-target);
                    if (difference == 0)
                        return temp;
                    if (difference < Math.abs(target-threeSum))
                        threeSum = temp;
                }
            }
        }
        return threeSum;*/

    }
}