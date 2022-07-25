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
		KnightsTour tour=new KnightsTour(5);
		tour.solve();
	}

}
