import java.util.HashMap;
import java.util.Map;

public class Temp {

    public static Map SumPair(int[] array, int givenSum){
        Map<Integer, Integer[]> map = new HashMap<>();

        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                int firstPointer = array[i];
                int secondPointer = array[j];

                if(firstPointer + secondPointer == givenSum){
                    map.put(i, new Integer[]{array[i],array[j]});
                }
            }
        }
        return map;
    }
}
