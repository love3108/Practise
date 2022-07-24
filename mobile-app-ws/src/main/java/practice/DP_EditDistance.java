package practice;

public class DP_EditDistance {

	public static void main(String[] args) {
	
		String s1="SON";
		String s2="SUN";
		System.out.println("No of edits : "+getNoOfEdits(13));
		System.out.println("No of edits Rec: "+editDisRec(s1,s2,0,0));
	}

	public static int getNoOfEdits(int n)
	{
		
		int a[][]=new int[4][4];
		String s1="SON";
		String s2="SUN";
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					//System.out.println("Equal s1.charAt(i-1)="+s1.charAt(i-1)+" s2.charAt(j-1)="+s2.charAt(j-1));
					a[i][j]=a[i-1][j-1];
					//System.out.println("i : "+i+" j : "+j+ "A{i}{j}="+a[i][j]);
							
				}else
				{
					//System.out.println("Not Equal s1.charAt(i-1)="+s1.charAt(i-1)+" s2.charAt(j-1)="+s2.charAt(j-1));
					a[i][j]=min(a[i-1][j],a[i][j-1],a[i-1][j-1])+1;
					//System.out.println("i : "+i+" j : "+j+ "A{i}{j}="+a[i][j]);
				}
			}
		}
		return (a[3][3]);
	}
	public static int max(int a,int b)
	{
		return a<=b?a:b;
	}

	public static int  editDisRec(String s1,String s2,int i1,int i2)
	{
		if(11>=s1.length()) {
			return s2.length()-i2-1;
		}
		if(12>=s2.length()) {
			return s1.length()-i1-1;
		}
		if(s1.charAt(i1)==s2.charAt(i2)) {
			return editDisRec(s1,s2,i1+1,i2+1);
		}
		else
		{
	       return 1+min(editDisRec(s1,s2,i1+1,i2),editDisRec(s1,s2,i1,i2+1),editDisRec(s1,s2,i1+1,i2+1));		
		}
	}
	public static int min(String a,String b,String c)
	{
		return a<b?(a<c?a:c):(b<c?b:c);
	}
	}
