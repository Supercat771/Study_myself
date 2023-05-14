package myalgorithm;

import java.util.Scanner;

public class Main_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N= sc.nextInt(), x= sc.nextInt();
		
		int [] A = new int[N];
		
	
		
		for(int i=0; i<A.length; i++) {
			
			
			A[i] = sc.nextInt();
			
			
				if(A[i]<x) {
					
				
					System.out.print(A[i] + " ");
				
				}
			
			
			
			
		} // end of for---------------------------
		
		
		
	} // end of main--------------------------

}
