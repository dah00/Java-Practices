package sec1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s){
        int sLength = s.length();

        Map<Integer, String> maplist = new HashMap<>();

        String longestPal = "";

        for(int i=0; i<sLength; i++){
            for(int j=i; j<sLength; j++){
                StringBuffer subBackward = new StringBuffer();
                for (int k=j; k>=i; k--){
                    subBackward.append(s.charAt(k));
                }
                String stringBackward = subBackward.toString();
                String stringForward = s.substring(i,j+1);

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
