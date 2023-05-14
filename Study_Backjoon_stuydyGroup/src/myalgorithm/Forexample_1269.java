package myalgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Forexample_1269 {

	public static void main(String[] args) throws IOException {
		
		  BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
		  
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
		  
		  HashMap<Integer , Integer>hash = new HashMap<>();
	 
		 StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		  
		  
		  int numA = Integer.parseInt(st.nextToken());
		  
		  
		  int numB = Integer.parseInt( st.nextToken() ) ;
		  
		  
		  int cnt = 0;
		  
		  
		  
		  
		  st = new StringTokenizer(bf.readLine());
		  
		  
		  for(int i=0; i<numA; i++) {
		  
		  int A = Integer.parseInt(st.nextToken());
		  
		  
		  hash.put( i, A );
		  
		 
		  }// end of for----------------
		  
		  
		  
		  st = new StringTokenizer(bf.readLine());
		  
		  
		  
		  
		  for(int i=0; i<numB; i++) {
		  
		  
		  int B = Integer.parseInt(st.nextToken());
		  
		  
		  	
		  	for (int j=0; j<numA; j++) {
		  		
		  		
		  		if(B == hash.get(j)) {
		  			
		  			cnt++;
		  			
		  		}
		  		
		  		
		  	}
		  
		 
		  
		  
		  
		  }// end of for----------------
		  
		  
		  
		  
		  
		  // 이건 틀린것 System.out.println(numA + numB - (2 * cnt));
		  
		  int ans = numA + numB - (2 * cnt);
		  
		  bw.write(String.valueOf(ans)); 
		  
		  bw.flush(); 
		  
		  bw.close();
		  
		 
		 

	}

}
