import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] array = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        System.out.println(Arrays.toString(plusOne(array)));
    }

    private static int[] plusOne(int[] digits) {
        long integer = 0;
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
        return result;
    }
}
