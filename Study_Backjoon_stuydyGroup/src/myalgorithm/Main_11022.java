package myalgorithm;

import java.util.Scanner;

public class Main_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A = 0 , B = 0, sum = 0;
		
		int[][]numArr = new int[T][2];
		
		for(int i=0; i<T; i++) {
			
			
			
			
			for(int j=0; j<numArr[0].length; j++) {
				
				
				
				
				if(j==0) {
					
					
					numArr[i][j] = sc.nextInt();
					
					A = numArr[i][j];
					
					
					
				}
				
				
				
				else {
					
					
					numArr[i][j] = sc.nextInt();
					
					B = numArr[i][j];
					
					
					
					
				}
				
				
				
			} // end of for-----------------------------------
			
			
			System.out.println("Case #" + (i+1) +":" + " " + A + " " + "+" + " " + B +" " +  "=" + " " + (A+B));

			
			
			
			
			
			
		} // end of for-=------------------------------------------------------

	}

}
