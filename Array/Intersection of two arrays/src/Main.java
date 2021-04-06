import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private int[] intersect(int[] nums1, int[] nums2){
        // Solution 2
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0, j=0; i<nums1.length && j<nums2.length;){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;


        // Solution 1
/*        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int element1: nums1){
            if (!map.containsKey(element1))
                map.put(element1, 1);
            else{
                int value = map.get(element1);
                map.put(element1, ++value);
            }
        }

        for (int element2: nums2){
            if (map.containsKey(element2)){
                int value = map.get(element2);
                if (value>0){
                    list.add(element2);
                    map.put(element2, --value);
                }
                if (value == 0)
                    map.remove(element2);
            }
        }

        int[] array = new int[list.size()];
        int count = 0;
        for (Integer element3 : list){
            array[count++] = element3;
        }

        return array;*/
    }
}
