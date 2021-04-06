public class Main {

    public static void main(String[] args) {

    }
    /*
        Write a function that reverses a string.
        The input string is given as an array of characters s.
        modifying the input array in-place with O(1)
     */
    private static void reverseString(char[] s) {
        // have an index at the beginning(i) and the end(j) of the array
        // swap s[i] wiht s[j]
        // i++ and j--
        // until i>j
        int i=0, j=s.length-1;
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++; j--;
        }

    }
}
