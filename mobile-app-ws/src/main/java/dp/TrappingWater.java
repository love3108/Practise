package dp;

public class TrappingWater {

	int heights[];
	int maxLeft[];
	int maxRight[];

	public TrappingWater(int heights[]) {
		this.heights = heights;
		this.maxLeft = new int[this.heights.length];
		this.maxRight = new int[this.heights.length];
	}

	public void solve() {
		this.maxLeft[0]=0;
		this.maxRight[0]=0;
		int prvMax=heights[0];
		for(int i=1;i<this.heights.length;i++) {
			int curr=heights[i-1];
			if(curr<prvMax) {
				maxLeft[i]=prvMax;
			}else {
				maxLeft[i]=curr;
				prvMax=curr;
			}
		}
		int j=0;
		prvMax=heights[this.heights.length-1];
		for(int i=this.heights.length-2;i>=0;i--) {
			int curr=heights[i+1];
			if(curr<=prvMax) {
				maxRight[i]=prvMax;
			}else {
				maxRight[i]=curr;
				prvMax=curr;
			}
		}
		System.out.print("Max Left : ");
		for(int i=0;i<this.heights.length;i++) {
			System.out.print(" "+maxLeft[i]);
		}
		System.out.println();
		System.out.print("Max Right : ");
		for(int i=0;i<this.heights.length;i++) {
			System.out.print(" "+maxRight[i]);
		}
		System.out.println();
		int res[]=new int[this.heights.length];
		for(int i=0;i<this.heights.length;i++) {
			int area=Math.min(maxLeft[i], maxRight[i])-heights[i];
			if(area>0) {
				res[i]=area;
			}
		}
		for(int i=0;i<this.heights.length;i++) {
			System.out.println(res[i]);
		}
	}
}
