package dp;

public class SubsetSum {
	
	boolean sol[][];
	int set[];
	int sum;
	public SubsetSum(int set[],int sum) {
		this.sum=sum;
		this.set=set;
		this.sol=new boolean[set.length+1][sum+1];
	}
	public void solve() {
		System.out.println("Subset Sum : "+solveProb());
		printSol();
	}
	public boolean solveProb() {
		for(int i=0;i<=set.length;i++) {
			sol[i][0]=true;
		}
		
		for(int i=1;i<=set.length;i++) {
			for(int j=1;j<=sum;j++) {
				
				if(set[i-1]>j) {
					sol[i][j]=sol[i-1][j];
				}else {
					if(sol[i-1][j]) {
						sol[i][j]=sol[i-1][j];
					}else {
						sol[i][j]=sol[i-1][j-set[i-1]];
					}
				}
				
			}
		}
		return sol[set.length][sum];
	}
	public void printSol() {
		for(int i=0;i<=set.length;i++) {
			for(int j=0;j<=sum;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}

	
}
