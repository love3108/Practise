package backtracking;

public class SudokuImpl {
	
	public static final int BOARD_SIZE=9;
	public static final int MIN_NUMBER=1;
	public static final int MAX_NUMBER=9;
	public static final int BOX_SIZE=3;
	private int[][] sudoku;
	
	public SudokuImpl(int [][]sudoku) {
		this.sudoku=sudoku;
	}
	public void solve() {
		if(solveSudoku(0, 0)) {
			printSolution();
		}else {
			System.out.println("No Solution");
		}
	}
	public boolean solveSudoku(int row,int col) {
		if(row==BOARD_SIZE){
			col++;
			if(col==BOARD_SIZE) {
				return true;
			}else {
				row=0;
			}
		}
		if(sudoku[row][col]!=0) {
			return solveSudoku(row+1, col);
		}
		
		for(int i=1;i<=MAX_NUMBER;i++) {
			if(isValid(row, col, i)){
				sudoku[row][col]=i;
				if(solveSudoku(row+1, col)) {
					return true;
				}
				sudoku[row][col]=0;
			}
		}
		return false;
	}
	public boolean isValid(int row,int col,int num) {
		for(int i=0;i<BOARD_SIZE;i++) {
			if(sudoku[i][col]==num) {
				return false;
			}
		}
		for(int i=0;i<BOARD_SIZE;i++) {
			if(sudoku[row][i]==num) {
				return false;
			}
		}
		//Check at box level
		int boxRowOffset=(row/3)*BOX_SIZE;
		int boxColOffset=(col/3)*BOX_SIZE;
		for(int i=0;i<BOX_SIZE;i++) {
			for(int j=0;j<BOX_SIZE;j++) {
				if(sudoku[boxRowOffset+i][boxColOffset+j]==num) {
					return false;
				}
			}
		}
		return true;
	}
	public void printSolution() {
		
		for(int i=0;i<BOARD_SIZE;i++) {
			if(i%3==0)System.out.println();
			for(int j=0;j<BOARD_SIZE;j++) {
				if(j%3==0)System.out.print(" ");
				System.out.print(sudoku[i][j]+" ");
			}
			System.out.println();
		}
	}

}
