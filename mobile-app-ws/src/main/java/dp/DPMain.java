package dp;

public class DPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfItems=4;
		int capacity=7;
		int weights[]= {0,1,3,4,5};
		int profitOfItems[]= {0,1,4,5,7};
		Knapsack ks=new Knapsack(noOfItems, capacity, weights, profitOfItems);
		ks.solve();
		ks.printResult1();
		ks.printResult2();
		KnapSackRec ksr=new KnapSackRec(noOfItems, capacity, weights, profitOfItems);
		ksr.solve();
		int set[]= {3,4,5};
		SubsetSum sb=new SubsetSum(set, 11);
		sb.solve();
	}

}
