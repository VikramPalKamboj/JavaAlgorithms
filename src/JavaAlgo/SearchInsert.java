package JavaAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
    	
    	Set<Integer> intList = new HashSet<Integer>();
    	for (int index = 0; index < nums.length; index++)
    	{
    	    intList.add(nums[index]);
    	}
    	intList.add(target);
    	TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
    	myTreeSet.addAll(intList);
    	
    	List<Integer> ls=new ArrayList<>(myTreeSet);
    	
    	
    	System.out.println(ls.indexOf(target));
		return ls.indexOf(target);
        
    }
    public static void main(String[] args){
    	SearchInsert sl=new SearchInsert();
    	int[] nums={1};
    	int target=1;
    	sl.searchInsert(nums, target);
    }
}