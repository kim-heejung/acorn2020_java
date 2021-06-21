  package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//필드
	private Connection conn;
	
	//생성자에서 Connection 객체를 얻어와서 필드에 저장한다.
	public DBConnect() { // Connection 을 만들 수 있는 갯수가 정해져있음.
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@14.63.164.99:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//필드에 저장된 Connection 객체의 참조값을 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
	
	/*
	 *	DB connection 생성 시점에 connection (:데이터 베이스와 연결하는) 객체의 참조값을 얻어오는 것임.
	 *	connection 객체의 참조값이 필요하면 new DBConnection().getConn() 해서 사용해주면 됨. 
	 *
	 *	getConn() 메소드가 connection 객체의 참조값을 리턴해주므로
	 *	Connection a=new DBConnection().getConn(); 에서
	 *	데이터 타입은 Connection 이 됨.
	 */
}








