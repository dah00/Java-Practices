public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /**
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * Clarification:
     * What should we return when needle is an empty string? This is a great question to ask during an interview.
     *
     * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     * @param haystack
     * @param needle
     * @return index
     */
    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        int index = 0;
        int needleLength = needle.length();
        while((index+needleLength) <= haystack.length()){
            String subStrHaytack = haystack.substring(index, index+needleLength);
            if (subStrHaytack.equals(needle))
                return index;
            index++;
        }
        return -1;
    }

    // "Obeedah" "ee"
    //         ^

    /*
                int len2 = needle.length();
		if (len2 == 0)
			return 0;
		for (int i = 0; i <= (haystack.length()-len2); i++) {
			if (haystack.substring(i, (i+len2)).equals(needle)) {
				return i;
			}

		}
		return -1;
     */
}
