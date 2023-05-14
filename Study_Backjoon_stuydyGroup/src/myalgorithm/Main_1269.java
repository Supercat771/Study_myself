package myalgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_1269 {

	public static void main(String[] args) throws IOException {  // 참고: https://theash.tistory.com/entry/%EB%B0%B1%EC%A4%80-1269%EB%B2%88-%EB%8C%80%EC%B9%AD-%EC%B0%A8%EC%A7%91%ED%95%A9-%EC%9E%90%EB%B0%94java

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Set<Integer> hashSet = new HashSet<>();

		Set<Integer> hashSet_2 = new HashSet<>();

		int numA = Integer.parseInt(st.nextToken());

		int numB = Integer.parseInt(st.nextToken());

		int cnt = 0;
		

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < numA; i++) {

			hashSet.add(Integer.parseInt(st.nextToken())); // hashSEt에 값넣어줌

		}

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < numB; i++) {

			hashSet_2.add(Integer.parseInt(st.nextToken())); // hashSEt_2에 값넣어줌

		}

		for (int nums : hashSet) {

			if (hashSet_2.contains(nums))    //  hashSet_2가 hashSet의 value들을 가지고 잇으면 cnt증가
				
				cnt++;

		}

		for (int nums : hashSet_2) {

			if (hashSet.contains(nums))	//  hashSet가 hashSet_2의 value들을 가지고 잇으면 cnt증가

				cnt++;

		}

		int dap = hashSet.size() + hashSet_2.size() - cnt;

		bw.write(String.valueOf(dap));
		bw.flush();
		bw.close();

		/*
		 * BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
		 * 
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
		 * 
		 * Map<Integer , Integer>hash = new HashMap<>();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		 * 
		 * 
		 * int numA = Integer.parseInt(st.nextToken());
		 * 
		 * 
		 * int numB = Integer.parseInt( st.nextToken() ) ;
		 * 
		 * 
		 * int cnt = 0;
		 * 
		 * 
		 * 
		 * 
		 * st = new StringTokenizer(bf.readLine());
		 * 
		 * 
		 * for(int i=0; i<numA; i++) {
		 * 
		 * int A = Integer.parseInt(st.nextToken());
		 * 
		 * 
		 * hash.put( A , i );
		 * 
		 * 
		 * }// end of for----------------
		 * 
		 * 
		 * 
		 * st = new StringTokenizer(bf.readLine());
		 * 
		 * 
		 * 
		 * 
		 * for(int i=0; i<numB; i++) {
		 * 
		 * 
		 * int B = Integer.parseInt(st.nextToken());
		 * 
		 * 
		 * 
		 * 
		 * for( Integer keys : hash.keySet() ) {
		 * 
		 * 
		 * if( B == keys ) {
		 * 
		 * cnt++;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }// end of for----------------
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // 이건 틀린것 System.out.println(numA + numB - (2 * cnt));
		 * 
		 * int ans = numA + numB - (2 * cnt);
		 * 
		 * bw.write(ans); bw.flush(); bw.close();
		 * 
		 * 
		 */
		// 시간초과 왜? hash set 안써서? 이중 for문이 있어서? 아니면 왜 대체. hashSet을 안써서 시간초과 난듯
		// hashmap이나 다른것들은 안될거같음. 버퍼라이터를 써도 문제가생김

	} // end of main---------------------------------------------

}
