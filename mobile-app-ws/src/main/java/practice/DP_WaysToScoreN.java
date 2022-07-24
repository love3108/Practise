package practice;

public class DP_WaysToScoreN {

	public static void main(String[] args) {
	
		
		System.out.print("No Of ways using rec : "+getNwaysRec(13));
	}
	public static int getNwaysRec(int n)
	{
		if(n<0) return 0;
		if(n==0) return 1;
		return getNwaysRec(n-3)+getNwaysRec(n-5)+getNwaysRec(n-10);
	}
	
}
