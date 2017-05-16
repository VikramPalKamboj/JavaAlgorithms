package JavaAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class PhoneTouchpad {
    public List<String> letterCombinations(String digits) {
    	
    	List<String> ls=new ArrayList<>();
    	if(digits!=""){
    	String[] items = digits.split("");
		System.out.println(items[0]);
    	Map<Integer, String> hm=new HashMap<>();
    	hm.put(2, "abc");
    	hm.put(3, "def");
    	hm.put(4, "ghi");
    	hm.put(5, "jkl");
    	hm.put(6, "mno");
    	hm.put(7, "pqrs");
    	hm.put(8, "tuv");
    	hm.put(9, "wxyz");
    	
    	
    	int v=Integer.parseInt( items[0]); 
    	
    	
    	int r=Integer.parseInt( items[1]);
    	
    	
    	if(v >=2 && v<10 && r>=2 && r<10){	
    		String a=hm.get(v);
        	String[] item = a.split("");
        	
        	String b=hm.get(r);
        	String[] itemss = b.split("");
        	
    	for (int i = 0; i < item.length; i++) {

    		for (int j = 0; j < itemss.length; j++) {
    			StringJoiner sj = new StringJoiner("");
    	        sj.add(item[i]);
    	        sj.add(itemss[j]);
    	        String result = sj.toString();
				ls.add(result);
			}
		}
    	}
    	else{
    		System.out.println(ls);
    		return ls;
    	}
    	
    	
    	System.out.println(ls);
		return ls;
    	}
    	else{
    		System.out.println(ls);
    	    return ls;
    	}
        
    }
    public static void main(String[] args){
    	PhoneTouchpad sl=new PhoneTouchpad();
    	sl.letterCombinations("");
    }
}
