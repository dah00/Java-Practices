import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String name = "Obeda";
        System.out.println(name.charAt(2));
    }

    /*
        Given a string s, return the first non-repeating character in it
        and return its index. If it does not exist, return -1.
     */
    private int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }
}
