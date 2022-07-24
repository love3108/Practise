package backtracking;

public class NQueensImpl {
	
	int [][]queens;
	int noOfQueens;
	public NQueensImpl(int noOfQueens) {
		this.noOfQueens=noOfQueens;
		this.queens=new int[noOfQueens][noOfQueens];
	}
	public void solveQueens() {
		processQueens(0);
		 printQueens();
	}
	public boolean processQueens(int col) {
		
		if(col==noOfQueens) {
			return true;
		}
		for(int i=0;i<noOfQueens;i++) {
			if(isPossible(i, col)) {
				queens[i][col]=1;
				System.out.println("Setting to 1,i="+i+" j="+col);
				if(processQueens(col+1)) {
					return true;
				}else {
					System.out.println("Setting to 0,i="+i+" j="+col);
					queens[i][col]=0;
				}
			}
		}
		return false;
	}
	public boolean isPossible(int row,int col) {
		//horizonal check
		System.out.println("Is possible for row :"+row+" Col:"+col);
		printQueens();
		for(int i=0;i<col;i++) {
			if(queens[row][i]==1) {
				System.out.println("horizonal check ->returning false ,row="+row+" col="+i);
				return false;
			}
		}
		//diagonal check upward
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(queens[i][j]==1) {
				System.out.println("diagonal check upward-> returning false ,row="+i+" col="+j);
				return false;
			}
		}
		//diagonal check downward
		for(int i=row,j=col;i<noOfQueens && j>=0;i++,j--) {
			if(queens[i][j]==1) {
				System.out.println("diagonal check downward-> returning false ,row="+i+" col="+j);
				return false;
			}
		}
		System.out.println("Returning true for row: "+row+" col:"+col);
		return true;
	}
	public void printQueens() {
		for(int i=0;i<noOfQueens;i++) {
			for(int j=0;j<noOfQueens;j++) {
				/*
				 * if(queens[i][j]==1) { System.out.print(" * "); }else {
				 * System.out.print(" - "); }
				 */
				System.out.print(" "+queens[i][j]+"");
			}
			System.out.println();
		}
	}

}
