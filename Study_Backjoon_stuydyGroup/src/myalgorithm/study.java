package myalgorithm;

import java.text.DecimalFormat;

public class ssfasdf {

	public static void main(String[] args) {
		
		double num = 3.1423000500;
		DecimalFormat df = new DecimalFormat("#.######"); // 소수점 이하 0 제거
		String formattedString = df.format(num); // 형식화된 문자열 생성
		double result = Double.parseDouble(formattedString); // 문자열을 다시 실수로 변환
		System.out.println(result);
		
		

	}

}
