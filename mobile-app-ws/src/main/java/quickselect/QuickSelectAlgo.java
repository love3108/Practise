package quickselect;

public class QuickSelectAlgo {

	public static void quickSort(int ar[],int left,int right) {
	
		if(left<right) {
			int pivot=partition(ar,left,right);
			quickSort(ar,left,pivot-1);
			quickSort(ar, pivot+1,right);
		}
	}
	public static int quickSelect(int ar[],int left,int right,int k) {
		
		int pivot=partition(ar, left, right);
		System.out.println("Pivot is  : "+pivot);
		if(pivot>k) {
			return quickSelect(ar, left, pivot-1,k);
		}else if(pivot<k) {
			return quickSelect(ar, pivot+1, right,k);
		}else if(pivot==k) {
			System.out.println("Max Min number at position : "+k+" is : "+ar[pivot]);
			return pivot;
		}
		return ar[pivot];
	}
	private static int partition(int ar[],int left,int right) {
		
		int index=left;
		int pivot=ar[right];
		for(int i=left;i<right;i++) {
			if(ar[i]<pivot) {
				swap(left,index,ar);
				index++;
			}
		}
		//System.out.println("Swapping : "+ar[index]+" with "+ar[right]);
		swap(index,right,ar);
		return index;
	}
	public static void swap(int left,int right, int ar[]) {
		int temp=ar[left];
		ar[left]=ar[right];
		ar[right]=temp;
	}
	
}
