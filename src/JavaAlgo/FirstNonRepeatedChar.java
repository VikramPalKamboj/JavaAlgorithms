package JavaAlgo;


import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedChar {
	
	  static Character r;
	public static Character testing(String str){
		HashMap<Character,Integer>  cht= 
                new HashMap<Character ,Integer>();
		    int i;
	        Character c ;
	      
	        
	        for ( i = 0; i <str.length(); i++) {
				c=str.charAt(i);
				if (cht.containsKey(c)) {
					  cht.put(  c ,  cht.get(c) +1 );					
				}
				else{
					cht.put(c, 1);
				}
			}
	        for (int j = 0; j < str.length(); j++) {
	        	 c= str.charAt(j);
				if (cht.get(c)==1) {
					r=c;
					break;
				}
				else {
					r=null;
				}
			}
			return r;
		    
		
		
	}

	public static void main(String[] args){
		
		 Scanner in = new Scanner (System.in);
	     String s=in.nextLine();
	     char c=testing(s);
	     System.out.println(c);
	}
}

