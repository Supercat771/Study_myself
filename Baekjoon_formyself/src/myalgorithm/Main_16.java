package myalgorithm;

import java.util.Scanner;

public class Main_16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		
		int queen = sc.nextInt();
		
		int look = sc.nextInt();
		
		int bishop = sc.nextInt();
		
		int knight = sc.nextInt();
		
		int pawn = sc.nextInt();
		
		String result ="";
		
		
		if(king>1 || king<=1) {
			
			result += (-king + 1)+ " ";
			
			
		}
		
		
		
		if(queen>1 || queen<=1) {
			
			result += (-queen + 1)+ " ";
			
			
		}
		
	
		
		
		if(look >2 || look<=2) {
			
			result += (-look + 2) + " ";
			
		}
		
		
		
		if(bishop >2 || bishop<=2) {
			
			result += (-bishop + 2) + " ";
			
		}
		
		
		
		if(knight >2 || knight<=2) {
			
			result += (-knight + 2) + " ";
			
		}
		
		
		
		if(pawn >8 || pawn<=8) {
			
			result += (-pawn + 8);
			
		}
		
		
		
		
		
		
		System.out.println(result);
		
		
		
		
		
		
		
	}// end of main-----------------

}
