import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    private void rotate(int[][] matrix){

        Stack<Integer>[] columns = new Stack[matrix.length];
        for (int i=0; i<matrix.length; i++)
            columns[i] = new Stack<>();

        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix.length; j++)
                columns[i].push(matrix[j][i]);

        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix.length; j++)
                matrix[i][j] = columns[i].pop();
    }
}
