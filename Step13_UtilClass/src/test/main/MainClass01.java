package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 저장할수 있는 index 로 관리되는 목록(List) 객체 
		ArrayList<String> names=new ArrayList<String>();
		//ArrayList : 어떤 데이터의 참조값을 순서있게 저장하는 class
		//ArrayList 의 < > 안에는 Generic type 을 적어야함, 기본 데이터 type 을 적을 수 없음
		/*
		 * add(), size(), get(), set(), remove(), clear() 메소드는 List 객체에도 있기 때문에
		 * List 객체로 받아도 무방함. ArrayList 가 AbstractList 를 상속 받았고, 
		 * AbstractList 안에 List<> implements 가 있다고 생각하면 됨.
		 */
		//String type 의 참조값 저장하기
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		// 배열의 방의 크기 얻어오기 
		int size=names.size();
		// 각각의 방에 저장된 값 불러오기
		String name1=names.get(0); //0번방
		String name2=names.get(1); //1번방
		String name3=names.get(2); //2번방

		// 특정 방의 값 수정(덮어쓰기)
		names.set(0, "이정호"); //0번방 수정
		
		// 특정 인덱스 삭제(방 자체를 제거하기)
		names.remove(1); // 1번방 삭제 
		
		// 모든 깨끗이 방 삭제
		names.clear();
		
		// 주로 사용하는 ArrayList 의 메소드들.
		
		/*
		 * ArrayList 는  Util 의  가변 배열 객체 => javascript 의 [] 와 비슷.
		 * add(), size(), get() 제일 많이 씀.
		 */ 
		
	}	
}





