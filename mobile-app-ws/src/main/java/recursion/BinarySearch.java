package recursion;

public class BinarySearch {

	public int binarySearch(int ar[],int left,int right,int item) {
		
		int mid=left+right/2;
		System.out.println("Inside binary search with left : "+left+" mid : "+mid+" right : "+right);
		if(mid<left || mid > right) return -1;
		if(ar[mid]==item) {
			return mid;
		}
		else if(item>ar[mid]) {
			return binarySearch(ar,mid+1,right,item);
		}else if(item<ar[mid]) {
			return binarySearch(ar,left,mid-1,item);
		}
		return -1;
	}
	
	
}
