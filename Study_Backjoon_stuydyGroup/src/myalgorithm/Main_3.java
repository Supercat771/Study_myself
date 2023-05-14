package myalgorithm;

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int countNum = sc.nextInt();
		
		int [] inputNumArr = new int[countNum];
		
		
		for(int i=0; i<inputNumArr.length; i++) {
			
			inputNumArr[i] = sc.nextInt();
			
			
			
		}// end of for-----------------------------------------
		
		int inputNum = sc.nextInt();
		
		
		int count =0;
		
		for(int j=0; j<inputNumArr.length; j++) {
			
				if(inputNum == inputNumArr[j]) 
					
					count++;
				
				
			
			
		}// end of for----------------------------------------------
		
		
		
		
		System.out.println(count);
		
		
	} // end of main-------------------------------------------------

}
