package leetCode1stMay2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class SumFour {
	 public static int a=0;
    public List<List<Integer>> threeSum(int[] nums,int target) {
    	
    	HashSet<List<Integer>> hs=new HashSet<>();

    	for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				
					for(int k=j+1;k<nums.length;k++){
						for (int k2 = k+1; k2 < nums.length; k2++) {
							
							List<Integer> arList=new ArrayList<Integer>();
							int result=nums[i]+nums[j]+nums[k]+nums[k2];
							if(result==target){
						    	arList.add(nums[i]);
						    	arList.add(nums[j]);
						    	arList.add(nums[k]);
						    	arList.add(nums[k2]);
						    	Collections.sort(arList);
						    	hs.add(arList);
						}
						
					 	
					    	
						}
						
						
					}
					
				}
		}
    	
    	List<List<Integer>> arListss=new ArrayList<List<Integer>>(hs);
    	System.out.println(arListss);
		return arListss;
        
    }
   
	public static void main(String[] args) {
		
		int[] S = {1, 0, -1, 0, -2, 2};
		SumFour sl=new SumFour();
		sl.threeSum(S,0);
		
	}

}