public class Solution {
    public int myAtoi(String s){
        int result;
        StringBuilder strDigit = new StringBuilder();
        boolean isNegative = false;

        //1. Read in and ignore any leading whitespace.
        s.trim();

        for(int index=0; index<s.length(); index++){
            char chr = s.charAt(index);

            //2. Check if next Char (if not the end) is  '-' or '+', read the char in
            if (chr == '-')
                isNegative = true;

            //3. Read in next char until next is either non-digit or reach the end
            if (Character.isDigit(chr))
                strDigit.append(chr);               // May not work, use Integer.parseInt(String.valueOf(chr)

        }
        //4. convert into integer
        result = Integer.parseInt(strDigit.toString());
        if (isNegative)
            result *= -1;

        //5. if result is out of 32-bit signed integer range, clamp it.
        return result;
    }
}
