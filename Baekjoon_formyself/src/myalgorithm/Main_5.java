package myalgorithm;

import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt() , M = sc.nextInt();
		
		int [][]A = new int[N][M];
		
		int [][]B = new int[N][M];
		
		
		
		for(int i=0; i<A.length; i++) 	{
			
			
			
			for(int j=0; j<A[i].length; j++) {
				
				
				A[i][j] = sc.nextInt();
				
				
				
				
				
				
			}// end of for-----------------------------
			
			
			
		
					
		}// end of for-----------------------------
		
		
		
		
		
		for(int i=0; i<A.length; i++) 	{
			
			
			
			for(int j=0; j<A[i].length; j++) {
				
				
				B[i][j] = sc.nextInt();
				
				
				
				
				
				
			}// end of for-----------------------------
			
			
			
		
			
			
			
			
			
			
			
		}// end of for-----------------------------
		
		
		
		for(int i=0; i<A.length; i++) {
			
			
			
			
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + B[i][j] + " ");
				
				
				
				
			}
			
			System.out.println();
			
			
		}
		
		
		

		
		
	}// end of main-----------------------------

}
