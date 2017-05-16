package leetCode1stMay2017;

public class Parentheses {
	int c=0;
    public int longestValidParentheses(String s) {
    	
    	String[] items = s.split("");
    	//System.out.println(items[0]);
    	String a="(";
    	String b=")";
    	for (int i = 0; i < items.length; i++) {
    		if (items[i].equals(a)) {
    			if (i+1 <items.length && items[i+1].equals(b)) {
					c=c+2;
					
				}
    			
    		}
		}
    	//System.out.println(c);
    	
    	if (c!=0) {
    		System.out.println(c);
    		return c;
		}
    	else {
    		System.out.println(0);
			return 0;
		}
    	
		
        
    }
    public static void main(String[] args){
    	Parentheses sl=new Parentheses();
    	sl.longestValidParentheses("(()()())");
    }
}