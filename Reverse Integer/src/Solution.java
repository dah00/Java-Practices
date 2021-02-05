public class Solution {
    public int reverse(int x){
        int reversed = 0;

        while(x!=0){
            int pop = x%10;
            x = x/10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;


        /**
         * My own solution
         * Failed to check if reversed is overflow
         */
        /*
        int newX = Math.abs(x);
        int numDigits = String.valueOf(newX).length();
        int reversed = 0;
        for (int i=0; i<numDigits; i++){
            if (newX/10 != 0){
                int pop = newX%10;
                reversed = reversed * 10 + pop;
                if (reversed>Integer.MAX_VALUE)
                    return 0;
                newX = newX/10;
            }
            else
                reversed = reversed * 10 + newX;
        }
        return (x<0) ? (reversed * -1) : reversed;*/
    }
}
