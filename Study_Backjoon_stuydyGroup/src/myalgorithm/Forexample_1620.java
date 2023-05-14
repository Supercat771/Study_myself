package myalgorithm;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Forexample_1620 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		sc.nextLine();
		
		
		Map<String,Integer> pkMon = new HashMap<>();
		
		List<String>arrList = new ArrayList<>();
		
		
		Pattern p = Pattern.compile("^[0-9]{1,6}$");
		
		
		for(int i=0; i<N; i++) {
			
			String name = sc.nextLine();
			
			pkMon.put(name, i);
			
			arrList.add(name);
			
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			
			
			
			String moonje = sc.nextLine();
			
			Matcher m = p.matcher(moonje);
			
			boolean isNum = m.matches();
			
			
			if(isNum) {
				
				sb.append(arrList.get(Integer.parseInt(moonje)-1));
				
				
			}
			
			
			else {
				
				
				sb.append(pkMon.get(moonje)+1);
				
			}
			
			sb.append("\t");
			
			
		}
		
		System.out.println(sb.toString());
		
		sc.close();
		
		
		

	}

}
