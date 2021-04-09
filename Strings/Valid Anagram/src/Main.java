import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println('a'-'z');
    }

    private boolean isAnagram(String s, String t){
    // Better solution
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;

        // 1st try
/*        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char chr = s.charAt(i);
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }

        for (int i=0; i<t.length(); i++){
            char chr = t.charAt(i);

            if(map.containsKey(chr))
                map.replace(chr, map.get(chr)-1);
            if(map.get(chr) == 0)
                map.remove(chr);
        }

        if (map.isEmpty())
            return true;


        return false;*/

    }
}
