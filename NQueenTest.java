/* 
The N Queen is the problem of placing 8 chess queens on an 8×8 chessboard
so that no two queens attack each other.
sample output=
one of the solution for 8-queens problem is
1 0 0 0 0 0 0 0
0 0 0 0 0 0 1 0
0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 1
0 1 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 0 0 0 0 1 0 0
0 0 1 0 0 0 0 0
*/
import java.util.*;

class NQueen{
	private int N;
	NQueen(int N)
	{
		this.N=N;
	}
	void printSolution(int board[][]){
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++)
				System.out.print(board[i][j]+ " ");
			System.out.println();
		}
	}
	
	boolean isSafe(int board[][], int row, int col){
		int i, j;
		for (i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		for (i=row, j=col; i>=0 && j>=0; i--, j--)
			if (board[i][j] == 1)
				return false;
		for (i=row, j=col; j>=0 && i<N; i++, j--)
			if (board[i][j] == 1)
				return false;
		return true;
	}
	boolean solveNQUtil(int board[][], int col){
		if (col >= N)
			return true;
		for (int i = 0; i < N; i++){
			if (isSafe(board, i, col)){
				board[i][col] = 1;
				if (solveNQUtil(board, col + 1) == true)
					return true;
				board[i][col] = 0;
			}
		}
		return false;
	}

	boolean solveNQ(){
		int board[][] = new int[N][N];
		if (solveNQUtil(board, 0) == false){
			System.out.print("Solution does not exist");
			return false;
		}
		printSolution(board);
		return true;
	}
}

class NQueenTest{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		NQueen obj= new NQueen(sc.nextInt());
		obj.solveNQ();
	}
}
