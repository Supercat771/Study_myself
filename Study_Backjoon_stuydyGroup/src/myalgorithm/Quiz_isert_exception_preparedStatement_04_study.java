package myalgorithm;

import java.sql.*;
import java.util.Scanner;

/*
▶ 학번 : 9003
▶ 성명 : 홍길동
▶ 연락처 : 010-2345-5234
▶ 주 소 : 서울시 마포구 월드컵북로 21
▶ 학급번호 : 3

>>> 학번 9003 은 이미 사용중이므로 다른 학번을 입력하세요!! <<<


▶ 학번 : 9006
▶ 성명 : 홍길동
▶ 연락처 : 010-2345-5234
▶ 주 소 : 서울시 마포구 월드컵북로 21
▶ 학급번호 : 20

>>> 학급번호 20 은 존재하지 않습니다. <<<
>>> 사용가능한 학급번호는 1,2,3 입니다. <<<


▶ 학번 : 9006
▶ 성명 : 홍길동
▶ 연락처 : 010-2345-5234
▶ 주 소 : 서울시 마포구 월드컵북로 21
▶ 학급번호 : 3

>>> 데이터 입력성공 !! <<<

*/

public class Quiz_isert_exception_preparedStatement_04_study {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		String stno = "";
		String fk_classno = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이버에 로딩
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "JDBC_USER", "gclass");
			
			System.out.print("▶ 학번 : "); 
			
			stno = sc.nextLine();
			
			System.out.print("▶ 성명 : "); 
			
			String name = sc.nextLine();
			
			System.out.println("▶ 연락처 : "); 
			
			String tel = sc.nextLine();
			
			System.out.println("▶ 주소 : "); 
			
			String addr = sc.nextLine();
			
			System.out.println("▶ 학급번호 : "); 
			
			fk_classno = sc.nextLine();
			
			
			String sql  = " insert into tbl_student(stno, name, tel, addr, fk_classno) "
						+ " values(to_number(?), ?, ?, ?, ?)";
			
					
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, stno);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, addr);
			pstmt.setString(5, fk_classno);
			
			
		
			int n = pstmt.executeUpdate(sql);
			
			if(n ==1) {
				
				System.out.println("데이터 입력 성공");
				
				
			}
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(">>> ojdbc8.jar 파일이 없습니다. <<<");
			
		} catch (SQLException e) {

			if(e.getErrorCode() == 1) {
				
				System.out.println(" 학번" + stno + "는 이미 사용중이므로 다른 학번을 사용하세요");
				
			}
			
			else if(e.getErrorCode() == 2291) { // 외래키에 위배되었다면은
				
				try {
				System.out.println(" 학급번호" + fk_classno + "는 없습니다.");
				
				
				String sql = " select Classno "
						   + " from tbl_class "
						   + " order by Classno asc ";
				
				pstmt.close();
				
				pstmt = conn.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				
				StringBuilder sb = new StringBuilder();
				
				while(rs.next()) {
					
					int classno = rs.getInt("CLASSNO");
					
					sb.append(classno+", ");
					
					
				}
				
					String str_classno =  sb.toString();	
					System.out.println("사용가능한 학급번호는" + str_classno.substring(0, str_classno.length()-2) + "입니다.");
				} catch (SQLException e1 ) {
					e.printStackTrace();
					
				}
				
			    }
			
			else {
				
				e.printStackTrace();
				
			}
			
		
			
			
		} finally {
			
			try {
				
				if( rs != null) {
					
					rs.close();
					rs = null;
					
				}
				
				if( pstmt != null) {
					
					pstmt.close();
					pstmt = null;
					
				}

				if( conn != null) {
					
					conn.close();
					conn = null;
					
				}
				
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		} // end of fianlly
		
		
		sc.close();
		
		System.out.println("프로그램 종료");
		
	} // end of main--------------------------------------------------

}
