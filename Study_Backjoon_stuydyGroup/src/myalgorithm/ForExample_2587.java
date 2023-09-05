package myalgorithm;

import java.io.*;
import java.util.*;

public class ForExample_2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		List<Integer> numList = new ArrayList<>();
		
		StringTokenizer st;
		
		for(int i=0; i<5; i++) {
			
			st = new StringTokenizer(br.readLine(), "\n");
			
			numList.add(Integer.parseInt(st.nextToken()));
			
			
		}
		
		Collections.sort(numList);
		
		int avg =0;
		
		for(int dap : numList) {
			
			
			avg += dap/5;
			
			
		}
		
		
		System.out.println( avg + "\n" + numList.get(2));
		
		
		
	}

}
