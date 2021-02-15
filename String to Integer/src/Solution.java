public class Solution {
    public int myAtoi(String s){
        // Working solution
        int index = 0;
        boolean isNegative = false;
        int result = 0;

        if (s.length() == 0)
            return 0;

        // Discard all leading whitespaces
        while(index<s.length() && s.charAt(index)==' ')
            index++;

        // Check if s is signed with the char '-' or '+'
        if (index<s.length() && (s.charAt(index)=='-' || s.charAt(index)=='+'))
            isNegative = (s.charAt(index++)=='-' ? true : false);

        // Build the result and check for overflow/underflow
        while(index<s.length() && s.charAt(index)>='0' && s.charAt(index)<='9'){
            if (result > Integer.MAX_VALUE/10 ||
                    (result == Integer.MAX_VALUE/10 && s.charAt(index)-'0' > Integer.MAX_VALUE%10))
                return (isNegative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = result * 10 + (s.charAt(index++) - '0');
        }

        return isNegative ? result * -1 : result;


        /**
         * My own solution
         * failed
         */
        /*int result;
        StringBuilder strDigit = new StringBuilder();
        boolean isNegative = false;

        //1. Read in and ignore any leading whitespace.
        s= s.trim();

        for(int index=0; index<s.length(); index++){
            char chr = s.charAt(index);

            //2. Check if next Char (if not the end) is  '-' or '+', read the char in
            if (chr == '-'){
                isNegative = true;
                chr = s.charAt(++index);
            }

            //3. Read in next char until next is either non-digit or reach the end
            if (!Character.isDigit(chr))
                return 0;
            else{
                do {
                    chr = s.charAt(index);
                    strDigit.append(chr);
                    index++;
                } while (index<s.length());
                break;
            }

        }
        //4. convert into integer
        result = Integer.parseInt(strDigit.toString());
        if (isNegative)
            result *= -1;

        //5. if result is out of 32-bit signed integer range, clamp it.
        return result;*/
    }
}
