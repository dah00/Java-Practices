import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /*
        put each row then column in a Set while checking
        if the Set contains the element already
     */
    private static boolean isValidSudoku(char[][] board){

        // Checking each row
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                Set<Character> set = new HashSet<>();
                if (board[i][j] != '.'){
                    if (set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }

        // Checking each column
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                Set<Character> set = new HashSet<>();
                if (board[j][i] != '.'){
                    if (set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }
        }

        return true;
    }
}
