public class Main {

    public static void main(String[] args) {
        String str = "obeda";
        String o = "oe";
        System.out.println(str.contains(o));
    }

    private static String longestCommonPrefix(String[] strs){
        // Brute force
        if (strs.length == 0)
            return "";


        // for all substring of the first element of strs possible
        // if the rest of the element of the strs contains that substring
            // store it in a variable result
            // append the next character of the first element and check
        String result = "";
        int initialIndexSub = 0;

        for (int i=0; i<strs[0].length()-1; i++){
            StringBuilder stringBuilder = new StringBuilder(strs[0].substring(initialIndexSub, i+1));
            boolean contains = true;


            int index = 1;              // traversing strs starting from the second element
            while (index < strs.length && contains){
                String str = strs[index++];         // to check if index++ is valid
                if (!str.contains(stringBuilder.toString()))
                    contains = false;
            }

            if (contains && result.length() < stringBuilder.length() ){
                result = stringBuilder.toString();
            }
            else
                initialIndexSub = i;

        }

        return result;

    }
}
