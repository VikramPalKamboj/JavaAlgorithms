package JavaAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SumThree {
	int a,b;
    public int threeSumClosest(int[] nums, int target) {
    	
    	List<Integer> res = new ArrayList<>();
  
    	
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i+1; j < nums.length; j++) {
    			for (int k = j+1; k< nums.length; k++) {
    				
    				int result=nums[i]+nums[j]+nums[k];
    				res.add(result);
    			}
    			
    		}
			
		}
    	res.add(target);
    	Collections.sort(res);
    	System.out.println(res);
    	int com=res.indexOf(target);
    	
    	if (res.get(com-1)!=null) {
    		 a=res.get(com)-res.get(com-1);
    		 System.out.println(a);
		}
    	if (res.get(com+1)!=null) {
    		 b=res.get(com+1)-res.get(com);
    		 System.out.println(b);
		}
    	
    	 if (b>a) {
    		System.out.println(res.get(com-1));
    		return res.get(com-1);
			
		} 
    	else if(b<a){
    		System.out.println(res.get(com+1));
    		return res.get(com+1);
		}
    	else {
			System.out.println(target);
			return target;
		}
    	
		
        
    }
    public static void main(String[] args){
    	int[] S = {-1,-2,3,4,8};
    	int target=6;
    	SumThree sl=new SumThree();
    	sl.threeSumClosest(S, target);
    	
    }
}