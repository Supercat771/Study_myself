package myalgorithm;

import java.util.Scanner;

public class Forexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int [] Alphabet = new int[26];
		
		String sum = "";
		
		for(int i=0; i<Alphabet.length; i++) {
			
			Alphabet [i] = -1;
			
		}
		
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(Alphabet[ch-97] == -1) {
				
				Alphabet[ch-97] = i;
				
				
				
			}
			
			sum += Alphabet[i] + " ";
			
			
		} // end of for------------------

		
		for(int i=0; i<Alphabet.length; i++) {
			
			System.out.print(Alphabet[i] + " ");
		}
		
	}

}
