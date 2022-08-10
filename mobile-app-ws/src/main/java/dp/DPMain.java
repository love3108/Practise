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
		String str1="ABDEGH";
		String str2="AIBDFHR";
		LongestCommonSubRec rec=new LongestCommonSubRec(str1, str2);
		rec.solve();
		
		int heights[]= {1,0,2,1,3,1,2,0,3};
		TrappingWater tr=new TrappingWater(heights);
		tr.solve();
		
	}

}
