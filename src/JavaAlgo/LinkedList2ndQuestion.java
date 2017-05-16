package JavaAlgo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class LinkedList2ndQuestion {

	 public int lengthOfLongestSubstring(String s) {
	    	
	    	Set<String> st=new HashSet<>();
	    	;
	     String[] ary = s.split("");
		     
		     for(int i=0;i<ary.length;i++)
			    {
			     st.add(ary[i]);
			    }
		     Iterator<String> itr=st.iterator();  
		     while(itr.hasNext()){ 	
		    	 System.out.println(itr.next());
		     }
			return 1;
			   
			 
	    }
	    
	      public static void main(String[] args)

	    {
	    	
	    	  LinkedList2ndQuestion solution=new LinkedList2ndQuestion();
	    	solution.lengthOfLongestSubstring("abcabcbbsdjkhddlaad");
	    	
	    }

}
