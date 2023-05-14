package myalgorithm;

import java.util.Scanner;

public class Forexample_1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			// Scanner 사용으로 키보드 입력값을 받아올수 있는 준비를 함 

		int N = sc.nextInt();
		
		
		sc.nextLine();
		
		String strArr[] = new String[N];
		
		int count = N;
		
		
		
		
		for(int i=0; i<N; i++) {
			
			strArr[i] = sc.nextLine();
			
			char[] chArr = strArr[i].toCharArray();
			
			boolean[] wordBool = new boolean[26];
			
			
			for(int j=0; j<strArr[i].length()-1; j++) {
				
				
				if(chArr[j] != chArr[j+1]) {
					
					if( wordBool [chArr[j+1] - 'a' ] )  {
					
						count--;
						
						break;
					}
					
					
				}
				
				
				wordBool[chArr[j] - 'a'] = true;
				
				
				
				
			} // end of for---------------------------
			
			
			
			
		}// end of for---------------------------
				
		
		
		System.out.println(count);
		
		sc.close();
		
		
	} // end of main---------------------------------------------
}

