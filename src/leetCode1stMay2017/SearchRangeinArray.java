package leetCode1stMay2017;

import java.util.ArrayList;
import java.util.List;

import org.mockito.internal.util.collections.ArrayUtils;

public class SearchRangeinArray {
    public int[] searchRange(int[] nums, int target) {
    	
    	
    	List<Integer> intList = new ArrayList<Integer>();
    	for (int index = 0; index < nums.length; index++)
    	{
    	    intList.add(nums[index]);
    	}
    	
    	int result=intList.indexOf(target);
    	List<Integer> il=new ArrayList<>();
		//il.add(intList.indexOf(target));
    	
		for (int i = result; i < nums.length; i++) {
			
			
			if(target==intList.get(i))
			{
				il.add(i);
			}
			
			
		}

		int[] ints = new int[il.size()];
	    int i = 0;
	    for (Integer n : il) {
	        ints[i++] = n;
	    }
		
		System.out.println(ints);
		
		int[] fail={-1,1};
		if (result>=0) {
			//System.out.println(ints);
			return ints;
		}
    	else {
    		//System.out.println(fail);
    		
			return fail;
		}
    	
    	
        
    }
    public static void main(String[] args){
    	SearchRangeinArray sl=new SearchRangeinArray();
    	int[] nums={5, 7, 7, 8, 8, 10};
    	int target=8;
    	System.out.println(sl.searchRange(nums,target ));
    }
}