package myalgorithm;

import java.util.Scanner;

public class Main_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]chessArr = new int [9][9];
		
		int max=-1,count_1 =0, count_2=0;
		
		
		
		for(int i=0; i<chessArr.length; i++) {
			
			
			
			
			for(int j=0; j<chessArr[0].length; j++) {
				
				
				chessArr[i][j] = sc.nextInt();
				
				if(max<=chessArr[i][j] ) {
					
					max= chessArr[i][j];
					
					count_1 = i+1;
					
					count_2 = j+1;
					
					
					
				}  // end of if---------------------
				
				
			}  // end of for-------------------------
			
			
			
			
		}// end of for-------------------------
		
		
		
		
		
		System.out.println(max);
		System.out.println(count_1 + " " + count_2 );

	} // end of main-------------------------

}
