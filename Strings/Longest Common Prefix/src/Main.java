public class Main {

    public static void main(String[] args) {
        String flower = "flower";
        String flow = "flow";

        System.out.println(flow.indexOf(flower));
    }

    private static String longestCommonPrefix(String[] strs){
/*        // Brute force
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

        return stringBuilder.toString();*/

        // Better solution
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;

    }


}
