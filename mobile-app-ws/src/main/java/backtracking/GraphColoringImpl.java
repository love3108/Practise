package backtracking;

public class GraphColoringImpl {
	
	public int graph[][];
	public int noOfVertices;
	public int noOfColors;
	public int colorMatrix[];
	public GraphColoringImpl(int graph[][],int noOfColors) {
		this.graph=graph;
		this.colorMatrix=new int[graph[0].length];
		this.noOfVertices=graph[0].length;
		this.noOfColors=noOfColors;
	}
	public void solve() {
		
		if(processSolution(0)) {
			printSolution();
		}else {
			System.out.println("No Solution found");
		}
		
	}
	public boolean processSolution(int nodeIndex) {
		if(nodeIndex==noOfVertices) {
			return true;
		}
		for(int i=1;i<=noOfColors;i++) {
			if(isColorValid(nodeIndex, i)) {
				colorMatrix[nodeIndex]=i;
				if(processSolution(nodeIndex+1)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean isColorValid(int nodeIndex,int colorIndex) {
		for(int i=0;i<noOfVertices;i++) {
			if(graph[nodeIndex][i]==1 && colorMatrix[i]==colorIndex) {
				return false;
			}
		}
		return true;
	}
	public void printSolution() {
		for(int i=0;i<noOfVertices;i++) {
			System.out.println("Color at index : "+i+" is : "+colorMatrix[i]);
		}
	}

}
