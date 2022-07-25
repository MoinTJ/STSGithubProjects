package moin.arrays;

import java.util.Arrays;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 int[] arrayvalues = arraymethod();
		 Integer[] arrayvalue1 = arraymethodobj();
		 
		 
	System.out.println("arrayvalue"+arrayvalues);	
	System.out.println("arrayvalue"+arrayvalues.toString());
	System.out.println("arrayvalue"+Arrays.toString(arrayvalues));
	System.out.println("arrayvalue"+Arrays.deepToString(arrayvalue1));
		
	}
	
	public static int[] arraymethod() {
		
		int arrayvalue[] = {1,2,3,4,5};

		Integer arrayvalue1[] = {1,2,3,4,5};
		
		return arrayvalue;
		
	}
	
   public static Integer[] arraymethodobj() {
		
		Integer arrayvalue1[] = {1,2,3,4,5};
		
		return arrayvalue1;
		
	}

}

