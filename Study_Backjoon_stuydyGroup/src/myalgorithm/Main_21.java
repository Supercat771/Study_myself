package myalgorithm;

import java.util.Scanner;

public class Main_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		for(int i=0; i<9; i++) {
			String str = "";
			
			str += N + " " + "*" + " " + (i+1) + " " + "=";
			
			int sum = N*(i+1);
			
			
			System.out.println(str + " " + sum);
			
		}// end of for-------------

	}

}
