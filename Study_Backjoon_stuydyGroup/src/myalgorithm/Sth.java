package myalgorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sth {

	public static void main(String[] args) {

		
		
		String str_num = "0-1-2-3-4-5-6-7-8-9";
		
		String[] str_num_arr = str_num.split("-");
		
		
		int[]num_arr = new int[str_num_arr.length];
		
		Pattern p = Pattern.compile("^[0-9]*$");
		
		boolean bool = false;
		
		int cnt = 0;
		
		int nnt = 0;
		
		StringBuilder sb = new StringBuilder();
		
		String ans = "";
		
		for(int i=0; i<str_num_arr.length; i++) {
			
			
			num_arr[i] = Integer.parseInt(str_num_arr[i]);
			
			Matcher m = p.matcher(str_num_arr[i]);
			
			if(m.matches()) {
				
				
				bool = true;
				
				cnt ++;
				
				ans = "yes";
				
			}
			
			else {
				
				
				bool = false;
				
				sb.append("no");
				
				nnt = i;
				
				ans = "no";
				
				break;
				
			}
			
			
		}
		
		
		System.out.println(bool +  "\n" + ans);
		

		
	}

}
