package dp;

public class LongestCommonSubRec {
	
	int ar[];
	String str1;
	String str2;
	
	public LongestCommonSubRec(String str1,String str2) {
		this.str1=str1;
		this.str2=str2;
	}

	public void solve() {
		System.out.println("Answer is : "+solveRec(this.str1,this.str2,0,0));
	}
	public int solveRec(String str1,String str2,int index1,int index2) {
		if(index1>=str1.length() || index2>=str2.length()) {
			return 0;
		}
		if(str1.charAt(index1)==str2.charAt(index2)) {
			return 1+solveRec(str1, str2, index1+1, index2+1);
		}else {
			return Math.max(solveRec(str1, str2, index1+1, index2), solveRec(str1, str2, index1, index2+1));
		}
	}
}
