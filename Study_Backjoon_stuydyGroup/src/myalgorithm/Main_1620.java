package myalgorithm;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_1620 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		List<String> arrList = new ArrayList<>();
		
		Map<String,Integer>pkMon = new HashMap<>();
		
		
		
		
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		sc.nextLine();
		
		
		
		
		
		for(int i=0; i<N; i++) {
			
			String name = sc.nextLine();
			
			arrList.add(name);
			
			pkMon.put(name, i);
			
			
			
			
		}
		
		Pattern p = Pattern.compile("^[0-9]{1,6}$");
		
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
			
			sb.append("\n");
			
			
			
		}
		
		System.out.println(sb.toString());
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt(), M = sc.nextInt();
//		
//		sc.nextLine();
//		
//		String qs = "";
//		
//		
//		
//		String sum = "";
//		
//		
//		Map<String, Integer>pkMon = new HashMap<String,Integer>();
//		
//		
//		
//		for(int i=1; i<N+1; i++) {
//			
//			
//			
//		pkMon.put(  sc.nextLine(), i);  // 키값은 내가 입력한값, 밸류는 내가 입력한값의 index를 나타나게끔 한다.
//			
//			
//			
//			
//		} // end of for-------------------------
//		
//		
//		
//		for(int i=0; i<M; i++) {
//			
//			
//			
//			
//			qs = sc.nextLine();
//			
//			
//			
//			if(     !(Character.isDigit(qs.charAt(0)))       ) { // 알파벳으로 시작하는 단어면
//				
//				
//				sum += pkMon.get(qs) + "\n";  // 포켓몬 이름, 즉 영어로 나오니까 해쉬맵의 해당 글자가 있는 밸류, 즉 index를 읽어 오게한다.
//				
//				
//				
//			}
//			
//			
//			else  {   // qs가 그게 아닌 숫자라면
//				
//				int num = Integer.parseInt(qs);  // 문자열형 숫자 qs를 num 정수로 바꿔준다
//				
//				
//				Set<String>keysets = pkMon.keySet(); 
//				
//				
//				
//				for(String key : keysets) {
//					
//					if( num == pkMon.get(key) ){ // String이 키값이고 int가 value 다 보니 이렇게 했다.
//						
//						
//						sum += key + "\n"; 
//						
//						
//						
//					}
//					
//					
//					
//				}
//				
//				
//				
//				
//				
//				
//			}
//			
//			
//			
//		} // end of for-------------------------------
//		
//		
//		
//		
//		System.out.println(sum);
//		
//		
//		
//		//    int num = Integer.parseInt(qs);  
//		
//		//    sum += pkMon.get(num) + "\n";
//		
//		/*			null
//					26
//					16
//					14
//					
//					           이런식으로  나오게 되고 밸류, 즉 인덱스을 읽어와서 null과 아예 나오지 않게되는 상황발생. 따라서 키셋을 써야함 키를 읽어올려면 
//					
//		*/				
//		
//		
//		
//		
//		
//		
		
		
		
		
		
	} // end of main---------------------------------------------

} // 시간초과
