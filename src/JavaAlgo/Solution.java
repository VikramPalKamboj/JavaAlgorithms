package JavaAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	
    public int firstMissingPositive(int[] nums) {
    	
    	
    	List<Integer> ar=new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
			ar.add(nums[i]);
		}
    	
    	Collections.sort(ar);
    	System.out.println(ar.get(nums.length-1));
		return 0;
		
    	
    	
        
    }
    public static void main(String[] args){
    	Solution sl=new Solution();
    	int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
    	System.out.println(sl.firstMissingPositive(nums));
    }
}