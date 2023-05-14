package myalgorithm;

import java.util.Scanner;

public class Forexample4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		str.toUpperCase();
		
		
		int[] count = new int[26];
		
		int max = 0;
		
		char answer = '?';
		
		
		for(int i=0; i<str.length(); i++) {
			
			
			int num = str.charAt(i) - 'A';
			
			count[num]++;
			
			
			
			
			
		} // end of for-------------------------------------------
		
		
		
		for(int i=0; i<count.length; i++) {
			
			
			if(max < count[i]) {
				
				max = count[i];
				
				answer = (char)(i + 'A');
				
				
			}
			
			
			else if(max == count[i]) {
				
				
				answer = '?';
				
				
			}
			
			
			
			
			
		}
		
		
		System.out.println(answer);
		
		
		

	}  // end of main----------------------------------------------------

}
