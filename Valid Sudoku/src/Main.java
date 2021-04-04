import java.util.HashMap;
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

    /**
       HashMap method: rows[i].getOrDefault(n, 0)
        => This method returns value mapped with the specified key,
            otherwise default value is returned.

     */
    private static boolean isValidSudoku(char[][] board){

        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] columns = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i=0; i<9; i++){
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                char num = board[i][j];
                if (num != '.'){
                    int n = (int)num;
                    int box_index = (i/3)*3 + j/3;

                    // keep the current cell value
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
                    boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

                    // check if this value has been already seen before
                    if (rows[i].get(n)>1 || columns[j].get(n)>1 || boxes[box_index].get(n)>1)
                        return false;
                }
            }
        }

        return true;



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
