package myalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class forExample_ {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		HashMap<String, Integer>hash = new HashMap<>();  // 듣도 못한놈
		ArrayList<String>arrList = new ArrayList<>();  // 듣도 보도 못한놈
		
		StringBuilder sb = new StringBuilder();
		
		
		int  N = Integer.parseInt(st.nextToken()) ;
		
		int  M = Integer.parseInt(br.readLine()) ;
		
		int count =0;
		
		for(int i=0; i<N; i++) {
			
			
			hash.put(br.readLine(), i);
			
			
		}
		
		
		for(int i=0; i<M; i++) {
			
			
			String str = br.readLine();
			
			
			if( hash.get(str) != null) {
				
				
				
				arrList.add(str);
				
				
				
				
			}
			
		}
		
		Collections.sort(arrList);
		
		System.out.println(arrList.size());
		
		
		for(String stryy : arrList) {
			
			
			System.out.println(stryy);
			
			
		}
		
		br.close();
		
		
	}

}
