package sec1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s){
        Map<Integer, String> maplist = new HashMap<>();

        String longestPal = null;
        int sLength = s.length();

        for(int i=0; i<sLength-1; i++){
            for(int j=i+1; j<sLength; j++){
                StringBuffer subBackward = "";
                for (int k=j; k>=i; k--){
                    subBackward.append(s.charAt(k));
                }
                String stringBackward = subBackward.toString();
                String stringForward = s.substring(i,j);

                if (stringForward.equals(stringBackward))
                   maplist.put(stringForward.length(), stringForward);
            }
        }

        int highestKey = 0;
        for (int key: maplist.keySet()){
            if (key>highestKey){
                highestKey = key;
                longestPal = maplist.get(key);
            }
        }

        return longestPal;
    }
}
