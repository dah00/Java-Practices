import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>((nums.length/2)+1);
        for(int element : nums){
            if (set.contains(element))
                set.remove(element);
            else
                set.add(element);
        }
        Integer value = set.toArray(new Integer[1])[0];
        return value;
    }
}
