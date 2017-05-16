package leetCode1stMay2017;

public class Parenthess {

    public boolean isValid(String s) {
    	
    	String[] item=s.split("");
    	
    	String[] items = "{,},[,],(,)".split(",");
    	
    	for (int i = 0; i < item.length; i++) {
    		
    		String a=items[4];
    		String b=item[i];
    		if (items[0].equals(item[i])) {
    			if (items[1].equals(item[i+1])) {
    				System.out.println("true1");
    				
				}
    			
    		}
    		if (a.equals(b)) {
    			if (items[5].equals(item[i+1])) {
        			System.out.println("true2");
        			

        		}
    		}
    		if (items[2].equals(item[i])) {
    			if (items[3].equals(item[i+1])) {
        			System.out.println("true3");
        			

        		}
    		}
		}
    	
    	
		return false;
        
    }
    public static void main(String[] args){
    	Parenthess sl=new Parenthess();
    	sl.isValid("(){}[]");
    }
}