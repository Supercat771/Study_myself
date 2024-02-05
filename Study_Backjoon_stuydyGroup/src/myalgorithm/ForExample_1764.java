package myalgorithm;

import java.io.*;
import java.util.*;

public class ForExample_1764 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		Map<String,Object> paraMap = new HashMap<>();
		
		
		List<String>ansList = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			
			
			paraMap.put(br.readLine(), i);
			
		}// end of for./...... 듣
		
		
		
		for(int i=0; i<M; i++) {
			
			String sth = br.readLine();
			
			if(paraMap.containsKey(sth)) {
				
				ansList.add(sth);
				
				
			}
			
			
		}
		
		Collections.sort(ansList);
		
		StringBuilder sb = new StringBuilder();
		
	    
		for(String s: ansList) {
			
			
			sb.append(s +"\n");
			
		}
		
		
		bw.write(String.valueOf(ansList.size() + "\n" + sb.toString()));
		
		
		bw.flush();
		
		bw.close();
		
	}

}
