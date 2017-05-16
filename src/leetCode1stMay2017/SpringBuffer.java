package leetCode1stMay2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpringBuffer {

	public static void main(String[] args) {
	
		//Split string
		String[] items = ",A,B,C".split(",");
		System.out.println("Split string");
		for (String item : items) {
		      System.out.println(item);
		}
		
		//Convert String Array To List
		String[] myArr = { "Apple", "Banana", "Orange" };
	      List<String> myL= Arrays.asList(myArr);
	      System.out.println("Convert Array To List");
	      for (String str : myL) {
	         System.out.println(str);
	      }
	      
	      
	      //Convert Java String Array To String Using java.util.Arrays
	      String[] testArray = {"Apple", "Banana", "Carrots"};
	      String testString = Arrays.toString(testArray);
	      System.out.println("Convert Java String Array To String Using java.util.Arrays");
	      System.out.println(testString);
	      
		// integer to StringBuffer to String .
		int number = -782;
		StringBuffer sb = new StringBuffer();
		sb.append(number);
		String numberAsString = sb.toString();
		System.out.println("Integer to StringBuffer to String");
		System.out.println(numberAsString);
		
		
		//integer StringBuilder to String.
		StringBuilder sb1 = new StringBuilder();
		sb1.append(number);
		String numberAsString1 = sb1.toString();
		System.out.println("Integer StringBuilder to String");
		System.out.println(numberAsString1);
		
		
		//integer to String
		int number1 = -782;
		String numberAsString3 = Integer.toString(number1);
        System.out.println("integer to String");
		System.out.println(numberAsString3);
		
		
		// Arraylist List<String> to array.
		List<String> myList1 = new ArrayList<String>();
        myList1.add("Bike");
        myList1.add("Bus");
        myList1.add("Car");
        Object[] myArray = myList1.toArray();
        System.out.println("Arraylist List<String> to array");
        for (Object myObject : myArray) {
           System.out.println(myObject);
        }
        
        
        //Arraylist List<Integer> to array.
        ArrayList<Integer> myLs = new ArrayList<Integer>();
        myLs.add(Integer.valueOf(5));
        myLs.add(Integer.valueOf(7));
        myLs.add(Integer.valueOf(15));
        Integer[] myArray1 = myLs.toArray(new Integer[0]);
        System.out.println("Arraylist List<Integer> to array");
        for (Integer myInt: myArray1) {
           System.out.println(myInt);
        }
        
        //Convert ArrayList to Array Using Streams in Java 8
        ArrayList<Integer> myLists = new ArrayList<Integer>();
        myLists.add(Integer.valueOf(5));
        myLists.add(Integer.valueOf(7));
        myLists.add(Integer.valueOf(15));
        Integer[] myArrays = myLists.stream().toArray(Integer[]::new);
        System.out.println("ArrayList to Array Using Streams");
        for (Integer myInt : myArrays) {
        	
           System.out.println(myInt);
        } 
        
        
        
        
	}

}
