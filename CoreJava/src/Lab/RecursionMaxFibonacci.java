package Lab;

import java.util.Scanner;

public class RecursionMaxFibonacci {

	public static int maxElement(int[] arr){
	    return maxElement(arr, 0);
	}
	public static int maxElement(int[] arr, int i){
	    if (i == arr.length) {
	        return Integer.MIN_VALUE;
	    }
	    return Math.max(arr[i], maxElement(arr, i+1));
	}
	
	 static int fibonacci(int n)
	 {
	    if (n <= 1) {
	       return n;
	    }
	    else {
	       return fibonacci(n-1) + fibonacci(n-2);
	    }
	 }
	      
	    
	
	
	public static void main(String[] args) {
		
		RecursionMaxFibonacci obj=new RecursionMaxFibonacci();
		System.out.println("MAXIMUM ELEMENT IN AN ARRAY USING RECURSION");
		int[] a=new int[] {750,1950,200,1000,550};
		System.out.println(maxElement(a));
		
		System.out.println("-------------------------------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("FIBONACCI SERIES USING RECURSION");
		System.out.println("Enter the value of n : ");
		int n=scan.nextInt();
	    System.out.println(fibonacci(n));
		
	}

}
