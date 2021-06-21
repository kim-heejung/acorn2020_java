package test.main;

import test.mypac.MyUtil; // ctrl 누른 상태에서 클래스명 클릭 시 해당 페이지로 찾아가짐.

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스의 static 메소드 호출하기
		MyUtil.send();
		//MyUtil 클래스의 static 필드에 값 대입하기 
		MyUtil.version="1.0";
		
		/*
		 * static : only one, single ton, 오직 하나만 만들어진다는 뜻.
		 * new 하지 않고 바로 사용가능.
		 * 붙이지 않으면 필드 메소드는 설계도에 불과함.
		 * 
		 * 영역에는 static, stack, heap 3 가지가 존재함.
		 * static => static 필드와 static 메소드를 가진 클래스가 만들어져서 올라감.
		 * stack => 지역 변수가 만들어져서 올라감.
		 * heap => 필드와 메소드로 이루어져 있는 객체가 만들어져서 올라감.
		 */
	}
}
