 package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *   DAO (Data Access Object)  의 약자
 *   
 *   - 만드는 방법
 *   
 *   1. 외부에서 객체 생성하지 못하도록 생성자의 접근 지정자를 private 로 지정
 *   2. 자신의 참조값을 저장할수 있는 필드를 private static 로 선언
 *   3. 자신의 참조값을 오직 하나만 생성해서 리턴해주는 static 메소드 만들기 
 *   4. 나머지 기능(select,insert,update,delete)들은 non static 으로 만들기
 *   
 *   오직하나만 만들어지도록 설계 많이 만들 필요가 없음, 
 *   많이 만들면 커넥션 개체가 무한으로 연결할 수 있는게 아니고 갯수가 정해져있음.
 *   
 *	 dao 만드는 법을 익혀야함.
 */
public class MemberDao {
	//자신의 참조값을 저장할 private 필드
	private static MemberDao dao;
	// 
	/*
	 * 객체를 오직 하나만 만들 수 있게 설계하면서 참조값을 dao 필드에
	 * 저장해놨으므로 값을 외부에서 바꿀 수 없게 private
	 * static 메소드 getInstance 안에서 사용하기 위해 static.
	 * (:non-static 은 객체를 생성해서 사용하고, static 은 static 영역에 오직하나 만들어지므로
	 * 둘의 영역이 달라서 사용 불가능)
	 */
	
	// private 로 만들어져서 외부에서 객체 생성하지 못함. 
	private MemberDao() {
		System.out.println("MemberDao 객체가 생성되었습니다.");
	} 
	
	//참조값을 리턴해주는 메소드
	public static MemberDao getInstance() {
		if(dao==null) {//최초 호출되면 null 이므로 
			dao=new MemberDao();
			/*
			 *	MemberDao static 필드를 null 만들어 놓고 getInstance 메소드 호출 시
			 *	객체를 생성해서, MemberDao static 필드에 담아줌.
			 *
			 *	생성자를 private 로 만들어 외부에서는 객체를 생성하지 못하기 때문에
			 *	메소드를 통해 만들어 질수 있게 만들어 놓고, 필요시에 getInstance 메소드를
			 *	class 이름에 . 찍어서 호출하면 처음에 static 영역에 객체가 만들어지고
			 *	(static 이 붙으면 static 영역에 한번만 객체가 만들어짐),
			 *	getInstance 는 dao 가 null 일 때, MemberDao 객체를 생성해주고
			 *	MemberDao 타입을 리턴해주니까 같은 참조값으로 여러번 참조해서 쓸수 있게 됨.
			 */
		}
		return dao; 
	}
	//회원 한명의 정보를 리턴해주는 메소드
	public MemberDto getData(int num) { // int num 을 select 문에 ? 에 바인딩해서 회원 정보를 가져옴.
		//회원 한명의 정보를 담을 MemberDto 
		MemberDto dto=null;
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT name,addr"
					+ " FROM member"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//query 문 수행하고 결과 얻어오기
			rs=pstmt.executeQuery();
			//반복문 돌면서 select 된 회원정보  읽어오기
			while(rs.next()) {
				//MemberDto 객체 생성해서 
				dto=new MemberDto();
				//회원 한명의 정보를 담는다. 
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				/*
				 * 회원 한명의 정보를 가져올 때는 row 한줄을 하나씩 가져오기만 하면되므로
				 * dto 에 하나씩 바로 담아주면 됨.
				 * 그리고 메소드의 인자로 primary key 인 num 을 전달받았기 때문에 전달 받은 그대로 적어주면 되고,
				 * name, addr 은 테이블 헤드 명으로 DB 에서 가져옴.
				 */
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close(); // 필요할 때 연결하고, 사용이 끝나면 닫아줌.
			}catch(Exception e) {}
		}		
		
		return dto;
	}
	
	//회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){
		//회원 목록을 담을 객체 생성
		List<MemberDto> list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT num,name,addr"
					+ " FROM member"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			//query 문 수행하고 결과 얻어오기
			rs=pstmt.executeQuery();
			//반복문 돌면서 select 된 회원정보  읽어오기
			while(rs.next()) {
				//회원정보를 list 에 담아 보세요.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//MemberDto 객체를 생성해서 회원 한명의 정보를 담는다.
				MemberDto dto=new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				//MemberDto 객체를 List 에 누적 시킨다.
				list.add(dto);
				/*
				 * 전체 회원의 정보를 가져올 때는 특정 회원의 정보를 가져오는게 아니므로 인자로 아무것도 전달 받지 않고
				 * 각각을 DB 에서 가져온 후, dto 의 setter 메소드를 이용해 필드 명으로 넣어줌 (=> 전체를 가져와야하므로)
				 */
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return list;
	}
	
	//회원 한명의 정보를 DB 에서 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="DELETE FROM member"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//회원 정보를 DB 에 저장하는 메소드 (작업의 성공여부가 boolean 으로 리턴된다)
	public boolean insert(MemberDto dto) { // 바인딩 해야될게 여러개면 MemberDto 에 담아서 ? 에 전달.
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql 문을 수행하고 변화된  row 의 갯수를 리턴 받는다. (1)
			flag=pstmt.executeUpdate();
			System.out.println("회원 정보를 추가 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true; //작업 성공이라는 의미에서 true  를 리턴한다.
		}else {
			return false; //작업 실패라는 의미에서 false  를 리턴한다.
		}
	}
	//회원 정보를 DB 에서 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			//update 된 row 의 갯수가 반환 된다. 
			flag=pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}






