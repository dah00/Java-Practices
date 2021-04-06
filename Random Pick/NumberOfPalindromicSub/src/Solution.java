class Solution {
    public int countSubstrings(String s) {

        // Solution O(n^2)
        int count = 0;

        for (int i=0; i<s.length(); i++){
            // odd-length palindrome, single character center
            count+= countpalindromeAroundCenter(s, i, i);

            // even-length palindrome, consecutive characters center
            count+= countpalindromeAroundCenter(s, i, i+1);
        }

        return count;
    }

    private int countpalindromeAroundCenter(String s, int start, int end){
        int count = 0;

        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }




        // My own solution O(n^3)
        /*        int count = 0;

        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                if (isPalindrome(s, i, j))
                    count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(String s, int start, int end){
        boolean isPal = false;
        while(s.charAt(start)==s.charAt(end) && start<end){
            start++;
            end--;
        }

        isPal = (start==end || (start-end)==1) ? true : false;
        return isPal;

         */


}