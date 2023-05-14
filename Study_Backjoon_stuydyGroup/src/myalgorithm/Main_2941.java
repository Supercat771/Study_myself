package myalgorithm;

import java.util.Scanner;

public class Main_2941 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		
		int count =0;
		
		
		for(int i=0; i<inputStr.length(); i++) {
			
			
			char str= inputStr.charAt(i);
			
			
			if(str == 'c') {
				
			  if(i< inputStr.length()-1)	{
				
				if(inputStr.charAt(i+1) == '='  ) {
					
					
					i++;
				}
				
				else if(inputStr.charAt(i+1) == '-') {
					
					
					i++;
				}
				
			  }
				
				
				
			}
			
			
			
			
			else if(str == 'd') {
				
				
				if(i< inputStr.length()-1) {	
					
				
					if(inputStr.charAt(i+1) == 'z' ) {
						
						
						if(i< inputStr.length()-2) {
						
					
							if(inputStr.charAt(i+2) == '=' ) {	
						
						
								i +=2;
							}
							
						}
						
					}
					
				
					else if(inputStr.charAt(i+1) == '-') {
						
						i++;
					}
				
				
				}
				
			}	
				
				
				
			
			else if( str == 'l') {
				
					
				if(i< inputStr.length()-1) {
					
				
						if(inputStr.charAt(i+1) == 'j' ) {
							
							
							i++;
						}
						
				
					}
				
				
			}
			
			
			
			
			
			
			else if(str == 'n') {
				
				
				if(i< inputStr.length()-1) {
					
					
				
						if(inputStr.charAt(i+1) == 'j' ) {
							
							
							i++;
						}
						
						
				}
				
				
				
			}
			
			
			
			else if( str == 's') {
				
				
				if(i< inputStr.length()-1) {
					
					
					
					if(inputStr.charAt(i+1) == '=' ) {
					
					
					i++;
					
					}
				
				}
				
				
			}
			
			
			
			
			else if( str == 'z') {
				
				
				
				if(i< inputStr.length()-1) {
					
					
				
					if(inputStr.charAt(i+1) == '=' ) {
						
						
						i++;
					}
				
				}
				
				
			}
			
			
			
			
			
			
			count ++;
			
		} // end of for------------------------------
		
		
		
		
		
		
		System.out.println(count);
		
		
	} // end of main------------------------------------------
}
