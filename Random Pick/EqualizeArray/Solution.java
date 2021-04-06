package EqualizeArray;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    static int equalizeArray(int[] arr) {
        int numberOfDelete;
        int maxValue = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element: arr){
            if (map.containsKey(element)){
                int numberOfValue = map.get(element);
                map.put(element, ++numberOfValue);
                if (maxValue<numberOfValue)
                    maxValue = numberOfValue;
            }
            else{
                map.put(element,1);
            }
        }

        numberOfDelete = arr.length - maxValue;

        return numberOfDelete;
    }
}
