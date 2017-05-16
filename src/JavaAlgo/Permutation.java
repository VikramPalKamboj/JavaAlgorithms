package JavaAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Permutation{
	int first=0;
	List<Integer> lss=new ArrayList<>();
	int t=0;
	int compare;
	Integer integer ;
	public void nextPermutation(int[] nums) {
		
		
		List<Integer> li=new ArrayList<>();
		List<List<Integer>> ls=permute(nums);
		for (int j = 0; j < ls.size(); j++) {
			List<Integer> lsq=ls.get(j);
			
			int a=lsq.size();
			int temp=0;
			for (int i = 0; i < lsq.size(); i++) {
				
		        t=(int)Math.pow(10,a-i-1);
				first=t*lsq.get(i);
				temp=first+temp;
				
			
			}
			compare=temp;
			li.add(temp);
		}
		
		Collections.sort(li);
		//System.out.println(li);
		//System.out.println(compare);
		//System.out.println(li.indexOf(compare));
		int r=li.indexOf(compare);
		
		if (li.size()!=(r+1)) {
			if (li.get(r+1)>li.get(r)) {
				System.out.println(ls.get(r+1));	
			}
			else {
				System.out.println(ls.get(1));
			}
			
		}
		else {
			System.out.println(ls.get(0));
		}
		
			

		
    }
	
	public List<List<Integer>> permute(int[] num) {
		
	    List<List<Integer>> res=new ArrayList<List<Integer>>();
	    
	    res.add(new ArrayList<Integer>()); // Add an empty list
	    
	    for(int number = 0; number < num.length; number++)
	    {
	    	
	        List<List<Integer>> curr = new ArrayList<List<Integer>>();
	        
	        for(List<Integer> nestedL : res)
	        {
	            for(int j = 0; j < nestedL.size() + 1 ;j++)
	            {
	            	
	                nestedL.add(j,num[number]);
	            	//System.out.println(nestedL);

	                List<Integer> temp = new ArrayList<Integer>(nestedL);
	                curr.add(temp);
	                nestedL.remove(j);
	            }
	        }
	        res = new ArrayList<List<Integer>>(curr);
	        
	    }

	   return res;
	}
	
	
	public static void main(String[] args){
		Permutation sl=new Permutation();
		
		int[] nums={1,2,4,5};
		
		sl.nextPermutation(nums);
		
		
	}
}