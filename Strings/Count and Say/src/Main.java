public class Main {

    public static void main(String[] args) {
        String str = countAndSay(6);
        System.out.println(str);
    }

    /**
     * New things learned:
     * Casting an integer into a char : Character.forDigit(repeat, 10);
     */

    /**
     * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     *
     * countAndSay(1) = "1"
     * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
     *
     * example:
     * Input: n = 4
     * Output: "1211"
     * Explanation:
     * countAndSay(1) = "1"
     * countAndSay(2) = say "1" = one 1 = "11"
     * countAndSay(3) = say "11" = two 1's = "21"
     * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
     *
     * @param n
     * @return say
     */
    private static String countAndSay(int n){
        String say = "1";

        while(n > 1){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0; i<say.length(); i++){
                char chr = say.charAt(i);
                int repeat = 1;

                while( i+1 < say.length() && chr == say.charAt(i+1)){
                    repeat++;
                    i++;
                }
                stringBuilder.append(repeat).append(chr);

            }
            say = stringBuilder.toString();
            n--;
        }

        return say;
    }
}
