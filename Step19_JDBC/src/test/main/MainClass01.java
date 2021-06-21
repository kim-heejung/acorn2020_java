package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 *  사용할수 있도록 설정해야 한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결객체를 담을 지역변수 만들기
		Connection conn=null; 
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe"; // localhost = 127.0.0.1
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger"); // ( ) 안 내용은 어디에 접속할지, 계정 아이디, 비밀번호 를 의미함.
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		} 
		/*
		 *	여기 까지가 oracle DB 에 접속하는 코드 => 커넥션 db 의 참조값을 얻어오는것이 목적.
		 *	connection : 데이터 베이스와 연결하는 객체.
		 *
		 *	외우지 않고, 이해만 하면됨.
		 */ 
		
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 만들기
		PreparedStatement pstmt=null; // PreparedStatement 는 sql 문을 실행해주는 객체, insert, update, delete, select 을.
		ResultSet rs=null; // java 에서는 실행한 sql 문을 ResultSet 에 담아옴.
		try {
			//실행할 sql  문
			String sql="SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql); // prapareStatement() 의 참조값을 얻어오면서 실행할 sql 문을 문자열로 만들어서 전달해주어야 함.
			//PreparedStatement 객체를 이용해서 query 문 수행하고 결과를 
			//ResultSet 객체로 받아오기
			rs=pstmt.executeQuery(); // select 문 실행시엔 executeQuery() 메소드를 호출해야 함, Query 는 select 문을 실행하겠다는 것.
			while(rs.next()) { // 로우가 여러개므로 반복문 실행. while 은 ( ) 안이 true 인 동안에 반복문을 돔.
				// .next() 는 데이터를 추출할 로우를 바꿔주는 역할, 커서 다음에 로우가 존재해 커서를 내릴 수 있으면 이 위치의 true 를 반환하면서 내림.
				int num=rs.getInt("num"); // 로우 한줄의 num,
				String name=rs.getString("name"); // name
				String addr=rs.getString("addr"); // addr 을 java 의 int, String, String 타입으로 추출.
				//출력하기
				System.out.println(num+" | "+name+" | "+addr);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	/*
	 *	DB 에 접속해서 select 문을 수행하려면 Connection, PreparedStatement, ResultSet 
	 *	3 개의 객체의 도움을 받아서 해결을 해야함, 객체를 어떻게 얻어내는지 알면 됨. 
	 */
}









