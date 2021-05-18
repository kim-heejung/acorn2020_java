package test.study;

import test.mypac.Car; // 다른 패키지에 들어있는 클래스는 import 해서 가져와서 써야함.

public class MyMain01 {
	public static void main(String[] args) {
	// 빨간색으로 표시되는 글씨는 예약어 (: 미리 특별하게 해석되기로 예약된 단어) 임.
		// field.
		Car c3;
		
		System.out.println("main 메소드가 시작되었습니다.");
		// local variable c1, c2.
		Car c1=new Car(); // Car 적고 ctrl, 스페이스바 누르면 자동으로 Car 클래스 import 할 수 있음.
		Car c2=new Car();
		// heap 영역에 각각의 두개의 객체를 만든거라서 id 값이 다름.
		c1.name="소나타"; // 객체는 자기 자신만의 고유한 데이터 저장소를 가질 수 있음.
		c2.name="그랜저";
	}
}
