package moin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Arrays");
		
	///	int arr[] = null;
	//	Integer arr1[] = null;
		
		Scanner console = new Scanner (System.in);
		//Find the Number of Elements in an Array
		
		System.out.println("Enter Arrays Values "); 
		
		//int arrayvalue= console.nextInt();
		//Integer arrayvalue1 = console.nextInt();
		
		
		int[] arr =new int[console.nextInt()];
	//	Integer[] arr1 =new Integer[console.nextInt()];
		
		
		for (int i=0;i<arr.length;i++) {
		
		System.out.println("Enter Values for  reading to string"); 
		arr[i]=console.nextInt();
	//	System.out.println("Enter Values for  reading deep to string"); 
	//	arr1[i]=console.nextInt();;
		
		
		}
		System.out.println(arr.length); 
		
		 System.out.println("Array elements are:");
		    for (int i=0; i < arr.length; i++) {
		      System.out.print(arr[i]+"\t");
		      
		    }
		System.out.println(Arrays.toString(arr)); 
		//System.out.println(Arrays.deepToString(arr1));    // java.util.Arrays.deepToString (Object [])
	}
}
