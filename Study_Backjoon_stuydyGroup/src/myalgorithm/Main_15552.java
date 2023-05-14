package myalgorithm;

import java.util.Scanner;

public class Main_15552 { // 버퍼리더 안써서 틀렸는데 안배워서 풀수가 없음. 알아서하라고하자 그냥 시간아까음

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int T = sc.nextInt();
		
		int[][] numArr = new int[T][2];
		
		int A =0, B = 0;
		
		String strSum = "";
		
		
		for(int i=0; i<numArr.length; i++ ) {
			
			
			for (int j= 0; j< numArr[0].length; j++) {
				
				
				if( j == 0 ) {
					
					
					numArr[i][j] = sc.nextInt();
					
					A = numArr[i][j];
					
					
					
				}
				
				else {
					
					
					
					numArr[i][j] = sc.nextInt();
					
					B = numArr[i][j];
					
					
					
					
				}
				
				
				
				
				
			} // end of for----------------------
			
			
			strSum += (A+B) + "\n";
			
			
			
		} // end of for-----------------------------------
		
		
		
	System.out.println(strSum);
		
		
		

	} // end of main-=------------------------------------------------

}
