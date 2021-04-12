import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String str = "0P";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String s){
        s = s.toLowerCase();
        StringBuffer sAlphNum = new StringBuffer();

        for (int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            if (chr>='a' && chr<='z' ||
                chr>='A' && chr<='Z' ||
                chr>='0' && chr<='9')
                sAlphNum.append(chr);
        }

        s = sAlphNum.toString();
        int i=0, j=s.length()-1;

        while(i<=j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
