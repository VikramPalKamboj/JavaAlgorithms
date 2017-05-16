package JavaAlgo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	int r=0;
	int first=0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	
    	List<Integer> ls=new ArrayList<>();
    	List<Integer> lss=new ArrayList<>();
		List<List<Integer>> ll=new ArrayList<>();

    	for (int i = 0; i < candidates.length; i++) {
			if ((candidates[i]+first)<target && first< target) {
				ls.add(candidates[i]);
				first +=candidates[i];
			}
			//System.out.println(first);
		}
		
		if (first<target) {
			
			int sub=target-first;
			for (int i = 0; i < candidates.length; i++) {
				if(candidates[i]==sub ){
					if (target==(candidates[i]+first)) {
						ls.add(candidates[i]);
						

					}
					
					
				}
				if (target==candidates[i]) {
					lss.add(candidates[i]);
				}
			}
			
		}
		ll.add(ls);

		if (!lss.isEmpty()) {
			ll.add(lss);
			return ll;
		}
		
		System.out.println(ll);
		return ll;
        
    }
    
    public static void main(String[] args){
    	int[] nums={1,2,1};
    	Solution sl=new Solution();
    	int target=3;
    	sl.combinationSum(nums, target);
    }
}