package dp;

public class KnapSackRec {
	
	int wghts[];
	int values[];
	int capacity;
	int n;
	public KnapSackRec(int n,int capacity,int weights[],int values[]) {
		this.n=n;
		this.wghts=weights;
		this.values=values;
		this.capacity=capacity;
	}
	public void solve() {
		System.out.println("Answer : "+solveRec(capacity, n));
	}
	public int solveRec(int weight,int n) {
		if(weight==0 || n==0 ) {
			return 0;
		}
		if(wghts[n-1]>weight) {
			return solveRec(weight, n-1);
		}else {
			int consider=values[n-1]+solveRec(weight-wghts[n-1],n-1);
			int dontConsider=solveRec(weight,n-1);
			return Math.max(consider, dontConsider);
		}
	}
}
