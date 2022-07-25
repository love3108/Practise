package backtracking;

import java.util.HashSet;

public class HamiltonianCycle {

	int matrix[][];
	int noOfVertcies;
	int hamiltonianPath[];
	HashSet<Integer> set=new HashSet();
	public HamiltonianCycle(int matrix[][],int noOfVertcies) {
		this.matrix=matrix;
		this.noOfVertcies=noOfVertcies;
		this.hamiltonianPath=new int[noOfVertcies];
	}
	
	public void solve() {
		
		hamiltonianPath[0]=0;
		set.add(0);
		if(findSolution(1)) {
			printSolution(null);
		}else {
			 System.out.println("No Cycle");
		}
		
	}
	public boolean findSolution(int position) {
		if(position==noOfVertcies-1) {
			if(matrix[hamiltonianPath[position-1]][hamiltonianPath[0]]==1) {
				return true;
			}
		}
		for(int i=1;i<noOfVertcies;i++) {
				if(isValidVertex(i, position)){
					hamiltonianPath[position]=i;
					System.out.println("Setting hamiltonianPath["+position+"]="+i);
					set.add(position);
					if(findSolution(position+1)) {
						return true;
					}
				}
		}
		return false;
	}
	public boolean isValidVertex(int vertex,int position) {
		if(matrix[hamiltonianPath[position-1]][vertex]==0) {
			return false;
		}
		 for (int i = 0; i < position; i++) {
			 if(hamiltonianPath[i]==vertex) {
				 return false;
			 }
		 }
		return true;
	}
	void printSolution(int path[])
    {
		path=hamiltonianPath;
        System.out.println("Solution Exists: Following" +
                           " is one Hamiltonian Cycle");
        for (int i = 0; i < noOfVertcies; i++)
            System.out.print(" " + path[i] + " ");
        
        // Let us print the first vertex again to show the
        // complete cycle
        System.out.println(" " + path[0] + " ");
    }
}
