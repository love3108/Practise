package backtracking;

/*Problem Statement:
Given a N*N board with the Knight placed on the first block of an empty board. Moving according 
to the rules of chess knight must visit each square exactly once. 
Print the order of each cell in which they are visited.*/
public class KnightsTour {

	public int chessBoard[][];
	public int boardSize;
	private int xMoves[]= {2,1,-1,-2,-2,-1,1,2};
	private int yMoves[]= {1,2,2,1,-1,-2,-2,-1};
	public KnightsTour(int boardSize) {
		this.boardSize=boardSize;
		this.chessBoard=new int[boardSize][boardSize];
		initialiseBoard();
	}
	public void initialiseBoard() {
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				chessBoard[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	public void solve() {
		chessBoard[0][0]=0;
		if(processSolution(1,0,0)) {
			printSolution();
		}else {
			System.out.println("No Solution");
			//printSolution();
			
		}
		
	}
	public boolean processSolution(int step,int x,int y) {
		//System.out.println("Step value is : "+step+" x:"+x+" y:"+y);
		if(step==boardSize*boardSize) {
			return true;
		}
		for(int moves=0;moves<yMoves.length;moves++) {
			int nextX=x+xMoves[moves];
			int nextY=y+yMoves[moves];
			//System.out.println("NextX is :"+nextX+" NextY is :"+nextY+" for step : "+step);
			if(isValid(nextX,nextY)) {
				chessBoard[nextX][nextY]=step;
				//printSolution();
				if(processSolution(step+1, nextX, nextY)) {
					return true;
				}
				chessBoard[nextX][nextY]=Integer.MIN_VALUE;
				
			}
		}
		return false;
	}
	public boolean isValid(int x,int y) {
		if(x<0 || x >=boardSize) {
			//System.out.println("Returning false for x:"+x+" y:"+y);
			return false;
		}
		if(y<0 || y >=boardSize) {
			//System.out.println("Returning false for x:"+x+" y:"+y);
			return false;
		}
		if(chessBoard[x][y]!=Integer.MIN_VALUE) {
			//System.out.println("Returning false for x,y value :"+chessBoard[x][y]);
			return false;
		}
		
		return true;
	}
	public void printSolution() {
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				System.out.print(" "+chessBoard[i][j]+" ");
			}
			System.out.println();
		}
	}
}
