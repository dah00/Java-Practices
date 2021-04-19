public class Main {

    public static void main(String[] args) {
        String str = countAndSay(6);
        System.out.println(str);
    }

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

        // Base case n=1 : say="1"
        //           n=2 : we count

        int count = 1;
        String say = "1";

        while(count<n){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i=0; i<say.length(); i++){
                char chr = say.charAt(i);
                int repeat = 1;

                while (i+1<say.length()) {
                    if (chr == say.charAt(i + 1)) {
                        repeat++;
                        i++;
                    }
                    else
                        break;
                }

                char temp = Character.forDigit(repeat, 10);
                stringBuffer.append(temp);
                stringBuffer.append(chr);
            }

            say = stringBuffer.toString();
            count++;
        }


        return say;
    }
}
