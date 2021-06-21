package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적: 아래의 useMen()  메소드를 호출하는것
		 *  아래의 useMen() 메소드를 호출해 보세요.
		 */
		
		//Men 객체를 생성해서 참조값을 m1 이라는 지역 변수에 담기 
		Men m1=new Men(new Blood("+", "O"));
		//useMen() 메소드 호출하면서 Men 객체의 참조값 전달하기 
		MainClass13.useMen(m1);
	}
	
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
	
	/*
	 * 상속을 받아 사용하는 이유 : 이미 만들어진 클래스 사용 시 우리가 어떤 작업을 할지 정확히 모르기 때문에
	 * 필요한 동작을 Overreid 해서 사용하게 제공하는 클래스가 많음.
	 */ 
}




