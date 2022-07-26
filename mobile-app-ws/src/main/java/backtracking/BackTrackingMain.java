package backtracking;

public class BackTrackingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NQueensImpl queen=new NQueensImpl(4);
		//queen.solveQueens();
		int graph1[][] = {{0, 1, 0, 1, 0},
	            {1, 0, 1, 1, 1},
	            {0, 1, 0, 0, 1},
	            {1, 1, 0, 0, 1},
	            {0, 1, 1, 1, 0},
	        };
		//HamiltonianCycle cycle=new HamiltonianCycle(graph1, graph1[0].length);
		//cycle.solve();
		int graphColor[][]= {{0,1,1,1,0,0},	
						{1,0,1,0,1,1},	
						{1,1,0,1,0,1},
						{1,0,1,0,0,1},
						{0,1,0,0,0,1},
						{0,1,1,1,1,0}};
		//GraphColoringImpl impl=new GraphColoringImpl(graphColor,4);
		///impl.solve();
		//KnightsTour tour=new KnightsTour(5);
		//tour.solve();
		 int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                 { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                 { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                 { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                 { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                 { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                 { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		 SudokuImpl sudoku=new SudokuImpl(grid);
		 sudoku.solve();
		 
	}

}
