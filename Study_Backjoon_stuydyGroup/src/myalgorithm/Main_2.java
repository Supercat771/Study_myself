package myalgorithm;

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int max=-1000001, min=1000001;
				
	    int [] numArr = new int[sc.nextInt()];
		
	    
	   
			
		for(int i=0; i<numArr.length;  i++ ) {
				
				 
				
				numArr[i] = sc.nextInt();
				
				
				if(max < numArr[i]) 
					
					max = numArr[i] ;
					
				
				
				
				
				if(min > numArr[i]) 
					
					min = numArr[i];
				
					
				
				
				
				
					
					
					
				
					
				
      
				
		}  // end of for
		
	
		
		
		
		
		System.out.println(min + " " + max );

	} // end of main

	
	
	
	
}
