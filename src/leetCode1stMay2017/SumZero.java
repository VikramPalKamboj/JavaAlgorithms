package leetCode1stMay2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class SumZero {
	 public static int a=0;
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	HashSet<List<Integer>> hs=new HashSet<>();

    	for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				
					for(int k=j+1;k<nums.length;k++){
						List<Integer> arList=new ArrayList<Integer>();
						int result=nums[i]+nums[j]+nums[k];
						if(result==0){
					    	arList.add(nums[i]);
					    	arList.add(nums[j]);
					    	arList.add(nums[k]);
					    	Collections.sort(arList);
					    	hs.add(arList);
					 	
					    	
						}
						
						
					}
					
				}
		}
    	
    	List<List<Integer>> arListss=new ArrayList<List<Integer>>(hs);
    	System.out.println(arListss);
		return arListss;
        
    }
   
	public static void main(String[] args) {
		
		int[] S = {-1, 0, 1, 2, -1, -4};
		SumZero sl=new SumZero();
		sl.threeSum(S);
		
	}

}