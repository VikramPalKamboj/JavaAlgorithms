package JavaAlgo;

public class WildcardMatching {
	
    public boolean isMatch(String s, String p) 
    {
    	String[] str=s.split("");
    	String[] str1=p.split("");
    	String st="?";
    	String sr="*";
    	for (int i = 0; i < str.length; i++) {
    		for (int j = 0; j < str1.length; j++) {
    			if (str[0].equals(str1[0]) || str1[0].equals(st) || str1[s.length()-1].equals(sr)) {
					if (str[i].equals(str1[j]) && str.length==str1.length || str.length>str1.length && str1[str.length-1].equals(sr) ) {
						System.out.println("true");
					}
				}
			}
			
		}
		return false;
    }

	public static void main(String[] args) {

		WildcardMatching wcm=new WildcardMatching();
		wcm.isMatch("aaa", "a*");
	}

}
