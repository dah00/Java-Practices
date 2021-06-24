import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String s = "dog cat cat fish";
	    String pattern = "abba";

        System.out.println(wordPattern(pattern, s));

    }

    static boolean wordPattern(String pattern, String s){
        // (a, dog)
        // (b, cat)
        // if (map contains 'b' AND map.get(b) == cat)
        // go to the next one
        // else return false
        Map<Character, String> map = new HashMap<>();
        // convert s into an array of string separated by whitespace
        String[] sArray = s.split(" ");
        int index = 0;

        if (pattern.length() != sArray.length)
            return false;

        while(index<pattern.length()){
            char chr = pattern.charAt(index);
            String str = sArray[index];
            if(map.containsKey(chr)){
                if(!map.get(chr).equals(str))
                    return false;
            }else{
                if(map.containsValue(str))
                    return false;
                map.put(chr, str);
            }
            index++;
        }

        return true;
    }
}
