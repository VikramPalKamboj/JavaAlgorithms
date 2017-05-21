package JavaAlgo;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {

	int r;
	int l;
	public int trap(int[] height) {
		
		List<Integer> ls=new ArrayList<Integer>();
		List<Integer> lss=new ArrayList<Integer>();
		
		for (int i = 0; i < height.length; i++) {
			
			for (int j = 1; j < height.length; j++) {
				if ( height[j]>=height[i]) {
					r=j-i+1;
					System.out.println(r);
					 int l=r*height[i];
					System.out.println(l);
					break;
					
				}
				
			}
			
				break;
			
		}
		return 0;
	        
	    }
	public static void main(String[] args)
	{
		TrappingRainWater trw=new TrappingRainWater();
		
		int[] height={1,0,1,1,0,1,3,2,1,2,1};
		trw.trap(height);
	}

}
