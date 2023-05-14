package myalgorithm;

import java.util.Scanner;

public class Forexample3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String str = sc.nextLine();
		
		str.toUpperCase();
		
		int[] count = new int[26];
		
		int max=0;
		
		int num = 0;
		
		char answer = '?';
		
		
		
		
		for(int i=0; i<str.length(); i++) {
			
			
			
			num = str.charAt(i) - 'A';
			
			count[num]++;
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		for(int i=0; i<count.length; i++) {
			
			if(max < count[i])
			{
				
				
				max = count[i];
				
				answer = (char)( i + 'A');
				
				
			}
			
			else if(max == count[i]) {
				
				
				
				
				answer = '?';
				
				
				
			}
			
			
			
			
			
			
			
			
			
		} //  end of for-------------------------------
		
		
		

		System.out.println(answer);
		
		
		
		
	}  // end of main------------------------------

}
