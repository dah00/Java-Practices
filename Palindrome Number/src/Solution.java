public class Solution {
    public boolean isPalindrome(int x){
        // if x is negative OR if the last digit is 0 return false
        if (x<0 || (x%10 == 0 && x != 0))
            return false;

        int reversed = 0;
        int tempX = x;

        // Reverse all x and store the reversed value in reversed
        while(tempX != 0) {
            int remainder = tempX % 10;
            reversed = reversed * 10 + remainder;
            tempX /= 10;
        }

        // Check if reverse is the same as x
        return (reversed == x);


    }
}
