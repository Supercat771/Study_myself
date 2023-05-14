package myalgorithm;

import java.util.Scanner;

public class Main_2525 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();;
		
		
		int C = sc.nextInt();
		
		String hour = "";
		
		
		if(B+C >= 60) {
			
			
			if ((B + C)%60 ==0) {
				
				A =	A + ((B + C)/60);
				
				
				
				
				
				if(A % 24 ==0) {
					
					
					A = 0;
					
				}
				
				
				if(A > 24) {
					
					
					A = A%24;
					
					
				}
				
				
				
				
				
				
				
				B = 0;
				
				hour = A + " " + B;
				
				System.out.println(hour);
				
			}
			
			else {
				
				A =	A + ((B + C)/60);
				
				
				
				

				
				
				

				if(A > 24) {
					
					
					A = A%24;
					
					
				}
				
				
				
				
				B = (B + C)%60;
				
				
				

				if(A % 24 ==0 ) {
					
					
					A = 0;
					
					
				
					
					
					
				}
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				hour = A + " " + B;
				
				System.out.println(hour);
				
				
			}
			
			
			
			
		}
		
		
		else { 
			
			B = B + C;
			
			hour = A + " " + B;
			
			System.out.println(hour);
			
			
			
		}
		
		
		
		
		
		

	} // end of main------------------------

}
