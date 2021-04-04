import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    Set seen = new HashSet();
	    
    }

    /*
    [[".",".",".",".","5",".",".","1","."],
     [".","4",".","3",".",".",".",".","."],
     [".",".",".",".",".","3",".",".","1"],
     ["8",".",".",".",".",".",".","2","."],
     [".",".","2",".","7",".",".",".","."],
     [".","1","5",".",".",".",".",".","."],
     [".",".",".",".",".","2",".",".","."],
     [".","2",".","9",".",".",".",".","."],
     [".",".","4",".",".",".",".",".","."]]

     */

    /*
        put each row then column in a Set while checking
        if the Set contains the element already
     */
    private static boolean isValidSudoku(char[][] board){

        //
        /*Set set = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.')
                    if (!set.add(number + "in row " + i) ||
                        !set.add(number + "in column " + j) ||
                        !set.add(number + "in box " + i/3 + "-" + j/3))
                        return false;
            }
        }

        return true;*/


        /*
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

        // Checking each 3x3 sub-boxes
        int i = 0;
        while(i<9){
            for (int j=0; j<3; j++){
                Set<Character> set = new HashSet<>();
                if (board[i][j] != '.'){
                    if (set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }

            for (int j=3; j<6; j++){
                Set<Character> set = new HashSet<>();
                if (board[i][j] != '.'){
                    if (set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }

            for (int j=6; j<9; j++){
                Set<Character> set = new HashSet<>();
                if (board[i][j] != '.'){
                    if (set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
            i+=3;
        }

        return true;*/
    }
}
