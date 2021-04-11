import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
    }

    private boolean isPalindrome(String s){

        Set<Character> set = new HashSet<>();
        s = s.toLowerCase();

        for (int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            if (chr>='a' && chr<='z' || chr >= 'A' && chr <= 'Z'){
                if (!set.contains(chr))
                    set.add(chr);
                else
                    set.remove(chr);
            }
        }

        if (set.size() <2)
            return true;
        return false;
    }
}
