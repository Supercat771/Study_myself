package myalgorithm;

import java.util.Scanner;

public class Main_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num_1 = sc.nextInt();
		
		int num_2 = sc.nextInt();
		
		int a = num_2%10;  // 1의 자리
		
		int b = ((num_2 - a)%100)/10;  // 10의 자리
		
		int c = (num_2 - (a+ 10*b))/100;  // 100의 자리
		
		
		int num_3 = a * num_1;   // (3)
		
		int num_4 = b * num_1;   // (4)
		
		int num_5 = c * num_1;   // (5)
		
		
		int num_6 = num_3 + 10 * num_4 + 100 * num_5;
		
		
		int []numArr = {num_3,num_4,num_5,num_6};
		
		
		for(int i=0; i<4; i++) {
			
			
			System.out.println(numArr[i]);
			
		}
		
		
		
		
		

	} // end of main-------------------------

}
