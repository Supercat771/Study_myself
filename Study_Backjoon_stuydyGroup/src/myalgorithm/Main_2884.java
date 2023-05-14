package myalgorithm;

import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		
		int m = sc.nextInt();
		
		
		String strHour;
		
		
		if( m < 45) {
			
			
			if( h ==0 ) {
				
				h = 23;
				
				m = m + 15;
				
				strHour = h + " " + m;
				
				System.out.println(strHour);
				
				
			}
			
			
			
			
			else {
			
			
				h = h-1;
				
				m = m + 15;
				
				strHour = h + " " + m;
				
				System.out.println(strHour);
				
				}
			
			
			
		}
		
		
		
		
		else {
			
			
			
			m = m - 45;
			
			
			strHour = h + " " + m;
			
			System.out.println(strHour);
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	} // end of main------------------------------------------------------

}
