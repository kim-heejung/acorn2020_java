package test.study;

import test.mypac.Car; // mypan 폴더에 만든 Car 클래스 가져옴.

public class MyMain01 {
	public static void main(String[] args) {
		// field
		Car c3;
		
		System.out.println("main 메소드가 시작되었습니다.");
		// local variable c1, c2
		Car c1=new Car(); // Car 적고 ctrl, 스페이스바 키 누르면 자동으로 Car 클래스 가져올 수 있음.
		Car c2=new Car();
		// 각각의 두개의 객체를 만든거라서 id 값이 다름
		// 같은 값을 가져왔지만 다른 값이 들어 있을 수 있음
		c1.name="소나타";
		c2.name="그랜저";
	}
}
