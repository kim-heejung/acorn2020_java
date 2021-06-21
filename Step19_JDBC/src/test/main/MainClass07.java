package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  member 테이블에 저장된 모든 회원의 정보를 
		 *  번호에 대해서 오름차순 정렬해서
		 *  List<MemberDto> 객체에 담아 오려고 한다. 
		 *  
		 *  이렇게 되면 heap 영역에 MemberDto 에 저장된 각각의 로우 (num, name, addr) 의 참조값을 가진 객체가 생겨나고,
		 *  그 각각의 방의 참조값을 가진 List<MemberDto> 객체가 생겨나게 됨.
		 *   
		 */
		
		//회원 목록을 담을 객체 생성
		List<MemberDto> list=new ArrayList<>(); // ArrayList 를 생성해서 MemberDto 로우 전체를 담겠다는 것임.
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		// 각각 null 의 초기값을 넣어준 이유는 사용 범위를 넓히기 위해서 일수도 있고, 
		// try, catch 문으로 묶지 않으면 exception 이 발생해서 일 수 도 있음.
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
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				MemberDto dto=new MemberDto();
				/*
				 *	MemberDto 객체 생성을 while 구문 밖에 적어서 하나만 만들게 되면 false 가 나올 때까지
				 *	데이터를 계속 덮어씌어 버려서 결국 마지막데이터만 남게되고 마지막 데이터의 참조값만
				 *	row 의 수만큼 list 객체의 참조값이 들어감.
				 */
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				list.add(dto);
				/*
				 *	table 에 들어있는 DB 를  MemberDto 타입의 List 객체에 담아 가져온다고 생각하면
				 *	우선 DB 에 저장된 데이터를 가져오고, 그 다음엔 MemberDto 타입의 객체의 넣어 반복문을 돌려 List Array 객체에  담아와야 한다.
				 *
				 *	next() 메소드는 MemberDto 객체로 가져올 데이터 row 가 존재해 커서를 밑으로 내릴 수 있으면 ture 를 반환해주므로 
				 *	true 가 나올 때 즉 데이터가 존재 할 때까지 반복문을 돌게 됨.
				 *	데이터 row 한줄의 num 을 쿼리문 수행하고 데이터가 담긴 rs 에 . 을 찍어 String type 을 인자로 전달해주면 int 의
				 *	리턴값을 반환해주는 getInt 메소드를 호출해 int type 에 담고,
				 *	String type 을 인자로 전달해주면 String type 을 리턴해주는 getString 메소드 사용해 name, addr 도 String type 으로 담아줌
				 *	그 후에는 MemberDto 객체를 생성해서 setter 메소드에 담아주면 각각의 MemberDto 객체에 저장됨.
				 *	마지막으론 list 객체에 누적 시켜주면 됨.
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
		
		//아래의 static 메소드 호출하기
		printMember(list);
		
	}// main()
	
	//회원목록을 콘솔창에 출력해주는 메소드 
	public static void printMember(List<MemberDto> list) {
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+" | "+
					tmp.getName()+" | "+tmp.getAddr());
		}
	}
}







