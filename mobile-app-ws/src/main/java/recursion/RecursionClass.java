package recursion;

public class RecursionClass {
	
	public void headRecur(int n) {
		//System.out.println("Head Recur,Value = "+n);
		if(n==0)return;
		headRecur(n-1);
	}
	public void tailRecur(int n) {
		if(n==-0)return;
		//System.out.println("Tail Recur before,Value = "+n);
		tailRecur(n-1);
		//System.out.println("Tail Recur After,Value = "+n);
	}
	public int headFact(int n) {
		if(n==1) return 1;
		int val=headFact(n-1);
		return n*val;
	}
	public int tailFact(int n,int a) {
		if(n==1) return a;
		return tailFact(n-1,a*n);
	}
	public int fibHead(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int val1=fibHead(n-1);
		int val2=fibHead(n-2);
		return val1+val2;
		
	}
	public int fibTail(int n,int a) {
		if(n==0 || n==1) {
			return 1;
		} 
		System.out.println("N : "+n+" a : "+a);
		return fibTail(n-1,n+a)+fibTail(n-2,n+a);
	}

	public void towersOfHanoi(int disk,char src,char mid,char dest) {
		if(disk==0) {
			System.out.println("Disk :"+disk+" moved from src :"+src+" to destination : "+dest);
			return;
		}
		towersOfHanoi(disk-1, src, dest, mid);
		System.out.println("Disk :"+disk+" moved from src :"+src+" to destination : "+dest);
		towersOfHanoi(disk-1, mid, src, dest);
	}
}
