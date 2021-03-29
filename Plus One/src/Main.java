import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] array = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        System.out.println(Arrays.toString(plusOne(array)));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i=length-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[length+1];
        newArray[0] = 1;

        return newArray;

        /**
         * 1st try
         * code runs but cannot support a large input of array like
         * {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}
         */
        /*long integer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int digit : digits) {
            integer *= 10;
            integer += digit;
        }
        integer++;

        while(integer/10 != 0){
            stack.push((int) (integer%10));
            integer /= 10;
        }
        stack.add((int)integer);

        int[] result = new int[stack.size()];
        int index = 0;
        while(!stack.empty())
            result[index++] = stack.pop();
        return result;*/
    }
}
