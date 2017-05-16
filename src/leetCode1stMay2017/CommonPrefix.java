package leetCode1stMay2017;


public class CommonPrefix {
	public String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    
	    for (int i = 1; i < strs.length; i++){
	    	
	        while (strs[i].indexOf(prefix) != 0) {
	        	System.out.println(strs[i].indexOf(prefix));
	            prefix = prefix.substring(0, prefix.length() - 1);
	            System.out.println(prefix);
	            if (prefix.isEmpty()) return "";
	        }  
	    }
	    return prefix;
	}

	public static void main(String[] args){
		Solution sl=new Solution();
		String[] str={"vikram","vicky"};
	     sl.longestCommonPrefix(str);
		
		
	}
}