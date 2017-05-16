package leetCode1stMay2017;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MedianOfArray {
   double result;
	static List<Integer> nums3=new ArrayList<>();
	private static Integer[] myArrays;
	 public double findMedianSortedArrays(int[] nums1,int[] nums2) {
		 

		 int f=myArrays.length;
			if (f%2!=0) // means odd numbers 
			{
				int t4=(f+1)/2;
				result=myArrays[t4-1];
				System.out.println(result);
				
				
			}
			else {
				int t=f/2;
				int a=myArrays[t-1];
	            int b=myArrays[t];
			     result=(double)(a+b)/2;
			    System.out.println(result);
				
			}
		return result;    
	    }
	 public static void main(String[] args){ 
		 int[ ] fact = {1, 3};
		 int[ ] fact1 = {2,4};
		 Solution marray=new Solution();	 

			 marray.findMedianSortedArrays(fact, fact1);
			   
	 }
}