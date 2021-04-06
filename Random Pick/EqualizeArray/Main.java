
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        //int[] arr = {2 ,1, 2, 1, 3, 3, 3, 3};
//        //int[] arr = {37, 32, 97, 35, 76, 62};
//        int[] arr = {10, 27, 9, 10 ,100, 38, 30, 32, 45, 29, 27, 29, 32, 38 ,32, 38, 14, 38, 29, 30, 63, 29, 63, 91, 54, 10, 63};
//        System.out.println(Solution.equalizeArray(arr));


        int[] arrayInt = {1,5,7,3,5,9,5,2};
        int sum = 10;

        Map<Integer, Integer[]> solution = Temp.SumPair(arrayInt, sum);

        for (Integer key : solution.keySet()){
            Integer[] array = solution.get(key);
            System.out.println(Arrays.toString(array ));
        }

    }
}
