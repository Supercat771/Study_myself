package myalgorithm;

import java.util.Scanner;

public class Forexample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		
		for(char i = 'a'; i<='z'; i++ ) {
			
			
			sb.append(s.indexOf(i) + " ");
			
			
			
		}
		
		
		System.out.print(sb.toString());
		
		

	}

}
