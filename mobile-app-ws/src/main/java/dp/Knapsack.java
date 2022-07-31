package dp;

public class Knapsack {

	int sol[][];
	int weights[];
	int values[];
	int capacity;
	int n;
	public Knapsack(int n,int capacity,int weights[],int values[]) {
		this.n=n;
		this.weights=weights;
		this.values=values;
		this.capacity=capacity;
		this.sol=new int[n+1][capacity+1];
	}
	public void solve() {
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<=capacity;j++) {
				
				int notTaking=sol[i-1][j];
				int takingItem=0;
				if(weights[i]<=j) {
					takingItem=values[i]+sol[i-1][j-weights[i]];
				}
				sol[i][j]=Math.max(takingItem,notTaking);
			}
		}
	}
	public void printResult1() {
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<=capacity;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void printResult2() {
		for(int i=n,w=capacity;i>0;i--) {
			if(sol[i][w]!=0 && sol[i][w]!=sol[i-1][w]) {
				System.out.println("Item considered : "+weights[i]);
				w=w-weights[i];
			}
			
		}
	}
	
}
