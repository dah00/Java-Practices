public class Main {

    public static void main(String[] args) {
        String[] str = {"ab", "a"};

        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] strs){
        // Brute force

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<strs[0].length(); i++){
            char chr = strs[0].charAt(i);

            boolean contains = true;
            int index = 1;
            while(index<strs.length && contains){
                if (i>=strs[index].length() || !(strs[index].charAt(i) == chr))
                    contains = false;
                index++;
            }

            if (contains)
                stringBuilder.append(chr);
            else
                break;
        }

        return stringBuilder.toString();

    }
}
