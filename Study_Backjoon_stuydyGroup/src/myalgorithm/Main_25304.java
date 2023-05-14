package myalgorithm;

import java.util.Scanner;

public class Main_25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int N = sc.nextInt();
		
		int sum =0;
		
		
		
		
		
		int[][] numArr = new int[N][2];
		
		
		for(int i=0; i<N; i++) {
			
			
			int a = 0 , b = 0;
			
			
			for(int j=0; j<numArr[0].length; j++) {
				
				
				if(j == 0) {
					
					
				
					a =  sc.nextInt();
					
					numArr[i][j] = a;
				
					
				
				}
				
				
				
				else {
					
					
					
					b= sc.nextInt();
					
					numArr[i][j] = b;
					
					
					
					
				}
				
				
				
				
				
			} // end of for-------------------
			
			
			
			
			sum += a * b;
			
			
			
			
			
		} // end of for------------------------
		
		
		
		if( sum == X ) {
			
			
			
			System.out.println("Yes");
			
			
			
		}
		
		
		else {
			
			
			
		
			
			System.out.println("No");
			
			
		}
		
		
		
		
		
		

	} // end of main-------------------------------------------------

}
