package myalgorithm;

import java.io.*;


public class ForExample_1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N= Integer.parseInt(br.readLine());
		
		ForExample_1427 num = new ForExample_1427();
		
		
		String answer = num.str_method(N);
		
		
		
		bw.write(answer);
		
		bw.flush();
		
		bw.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	

	private String str_method(int n) {

		String num_str = String.valueOf(n);
		
		char[]num1 = num_str.toCharArray();
		
		
		
		for(int i=0; i<num1.length; i++) {
			
			
			for(int j=i+1; j<num1.length; j++) {
				
				
				char dum = 0;
				
				if(num1[i] < num1[j]) {
					
					dum = num1[j];
					
					num1[j] = num1[i];
					
					num1[i] =  dum;
					
					
				}
				
				
				
				
				
			}// end of for----
			
			
			
			
		}// end of for----
		
		

		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<num1.length; i++) {
			
			
			sb.append(num1[i]).append("");
		}
		
		
		
		
		return sb.toString();
	}

}
