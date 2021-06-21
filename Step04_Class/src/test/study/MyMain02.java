package test.study;

import java.io.PrintStream;
import test.mypac.Car;

public class MyMain02 {
	public static void main(String[] args) {
		System.out.println("김구라");
		/*
		 * System class 안에 out 필드 안에 println() 메소드.
		 * out 데이터 타입의 참조 데이터 타입이기 때문에 heap 영역에 객체로 만들어져 있고 그 참조값이 out 에 들어있다고 생각할 수 있음,
		 * 또 데이터 타입의 객체 안에 println() 메소드가 있는 것임 (필드 안에 값을 넣고, 바꿀 수도 있지만 객체의 값을 사용하기 위함일수도 있음)
		 * 
		 * System 에 있는 메소드를 쓸 일은 많지 않음.
		 */
		
		PrintStream a=System.out;
		a.println("해골");
		a.println("원숭이");
		
		long current=System.currentTimeMillis(); // 현재 시간을 초로 바꿔서 long 타입으로 리턴해줌.
		a.println(current);
		
		String str="안녕하세요";
		String str2=new String("안녕하세요"); // 원래는 이게 맞지만 자주쓰는거기 때문에 위에 처럼 써도되게 만든 것.
		
		Car c1=new Car();
	}
}
