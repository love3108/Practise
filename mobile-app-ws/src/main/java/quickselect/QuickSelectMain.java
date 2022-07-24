package quickselect;

public class QuickSelectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={8,7,6,5,4,3,2,1};
		//QuickSelectAlgo.quickSort(ar, 0, ar.length-1);
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.println(ar[i]); }
		 */
		System.out.println(QuickSelectAlgo.quickSelect(ar, 0, ar.length-1,2));
	}

}
