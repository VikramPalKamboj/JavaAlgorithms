package JavaAlgo;

public class ReverseOrder {
	
	
	
	int result=0;
    public int reverse(int x) {
    	
    
    	     int y=x;
    		while (x != 0) {    
        	    int last_digit = x % 10;   
        	    result = result * 10 + last_digit;
        	    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    return 0;
                }
        	    x = x / 10; 
        	}
        	if (y==result) {
        		System.out.println("true");
				return 1;
			}
        	else {
        		System.out.println("false");
        		return 0;
			}
        
    }
	public static void main(String[] args) {

		ReverseOrder rOrder=new ReverseOrder();
		rOrder.reverse(-2147483648);
	}

}
