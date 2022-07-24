package binarysearch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MinimiseTheMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4 };
		int n = array.length;
		int K = 4;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH");
		Date date = new Date();
		
		System.out.println(dateFormat.format(date)+"   "+date.getHours());
		minTheMax(array,K);
	}

	public static void minTheMax(int ar[],int k) {
		int low=0;
		int high=10;
		int ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isPossible(k,ar,mid)) {
				ans=mid;
				high=mid-1;
			}else
			{
				low=mid+1;
			}
		}
		System.out.println("Low is  : "+ ans);
	}

	public static boolean isPossible(int k, int ar[], int mid) {
		int p = 0;
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > mid) {
				System.out.println("Not posiible : "+ mid);
				return false;
			}
			if (sum + ar[i] < mid) {
				sum += ar[i];
			} else {
				sum = ar[i];
				p++;
			}
		}
		p++;
		if (p <= k) {
			System.out.println("p[osiible : "+ mid);
			return true;
		} else {
			System.out.println("Not p[osiible : "+ mid);
			return false;
		}
	}
}
