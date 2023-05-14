package myalgorithm;

import java.util.Scanner;

public class Main_2675 {  // 2675번 

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		int R;
		
		String S;
		
		String strSum = "" ;
		
		
		for(int i=0; i<T; i++) {
			
			
			
			
			R = sc.nextInt();
			
			S = sc.nextLine();
			
			
			
		
			
			
			for(int j=0; j<S.length(); j++) {
				
				
				char ch = S.charAt(j);
				
				
				
						
					
					for(int k=0; k<R; k++) {
						
						
						strSum +=ch;
						
						
					}// end of for-------------
					
					
			
				
				
				
				
				
				
				
				
				
			} // end of for------------------
			
			
			
			strSum += "\n";
			
			
			
			
			
		
			
			
			
			
			
			
			
			
	
			
			
		} // end of for-------------------
		
		
			
		
		
		
		System.out.println(strSum.replace(" ", ""));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main---------------------------------------

}
