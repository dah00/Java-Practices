package sec1;


public class Solution {
    public String longestPalindrome(String s){

        // O(n^2) Solution
        if (s.length()<=1)
            return s;

        int start = 0, end = 0;

        for (int i=0; i<s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1,len2);
            if (len > end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }

        return s.substring(start, end+1);
    }

    // Expend the palindrome and return the longest one
    private int expandAroundCenter(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


        // My solution o(n^3)

        /*int sLength = s.length();

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

        return longestPal;*/

}
