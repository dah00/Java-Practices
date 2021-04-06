import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(3^5);
    }

    private int singleNumber(int[] nums) {
        // O(n) with 1ms using XOR
        /**
         * a XOR 0 = a
         * a XOR a = 0
         * So, a XOR b XOR c XOR a XOR b = c
         */
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;

        // O(n) with 8ms
        /*       Set<Integer> set = new HashSet<>((nums.length/2)+1);
        for(int element : nums){
            if (set.contains(element))
                set.remove(element);
            else
                set.add(element);
        }
        Integer value = set.toArray(new Integer[1])[0];
        return value;*/
    }
}
