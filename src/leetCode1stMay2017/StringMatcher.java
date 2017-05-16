package leetCode1stMay2017;

public class StringMatcher {
 	
  public boolean isMatch(String s, String p) {
	  
	  

     
      
      if (s.matches(p) || s.matches(p)) {
		System.out.println("true");
	}
      return true;
		
	  
    }

	public static void main(String[] args) {
		StringMatcher sMatcher=new StringMatcher();
		sMatcher.isMatch("vikram", "*");
	}
		/*String[] words = {"{apf","hum_","dkoe","12f"};
	    for(String s:words)
	    {
	        if(s.matches("[a-z]+") || s.matches("(.*)[a-z]+(.*)"))
	        {
	            System.out.println(s);
	        }
	    }

	}*/

}
