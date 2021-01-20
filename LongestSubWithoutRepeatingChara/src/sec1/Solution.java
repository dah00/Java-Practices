package sec1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        if (s.isEmpty())
            return 0;

        int length = 1;
        Map<StringBuffer, Integer> map = new HashMap<>();

        for (int i=0; i<s.length()-1; i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            StringBuffer str = new StringBuffer();
            str.append(s.charAt(i));

            for (int j=i+1; j<s.length(); j++) {
                char chr = s.charAt(j);
                if (!set.contains(chr)) {
                    set.add(chr);
                    str.append(chr);
                    map.put(str, str.length());
                }
                else
                    break;
            }

        }

        for (StringBuffer keys : map.keySet()){
            if (length<map.get(keys))
                length = map.get(keys);
        }

            return length;
    }
}
