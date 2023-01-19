package myalgorithm;

import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int [] numArr =  new int [9];
				
		
		int max = 0;
		
		int count = 0;
		
		for(int i=0; i<numArr.length; i++) {
			
			
			
			
			numArr[i] = sc.nextInt();
			
			if(numArr[i]> max) {
				
				max = numArr[i];
				
				count = i+1;
			}
		    
			
			
				
		}// end of for----------------
		
		
		
		
	
		
		System.out.println(max);
		System.out.println(count);
		
	}  // end of main

}
