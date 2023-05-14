package myalgorithm;

import java.util.Scanner;

public class Main_11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[][]numArr = new int[T][2];
		
		int A=0,B=0;
		
		
		for(int i=0; i<T; i++) {
			
			
			
			
			for(int j=0; j< numArr[0].length; j++) {
				
				
				if( j == 0) {
				
				
				
					numArr[i][j] = sc.nextInt();
					
					A = numArr[i][j];
					
				
				}
				
				
				else {
					
					
					
					numArr[i][j] = sc.nextInt();
					
					B = numArr[i][j];
					
				
				}
				
				
				
				
				
				
			} // end of for----------------------------------------
			
			System.out.println("Case #" + (i+1) + ":" +" " + (A+B) );
			
			
			
		}  // end of for-=------------------------------

	}

}
