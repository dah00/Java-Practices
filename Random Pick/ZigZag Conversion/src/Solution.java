import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows){

        // O(n) Solution
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();


        // My code (did not work)

/*        String str = "";
        char[][] array = new char[numRows][s.length()/2];
        int i = 0, j = 0;
        for (int k=0; k<s.length(); k++){
            array[i][j] = s.charAt(k);
            if (i==numRows-1 && i!=0){
                j++;
                i--;
                continue;
            }
            i++;
        }*/

    }
}
