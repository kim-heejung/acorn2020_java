package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 SmartPhone type 의 지역변수 p1 에 담기 
		SmartPhone p1=new SmartPhone(); 
		//p1 에 담긴 참조값을 HandPhone type 지역변수 p2 에 담기
		HandPhone p2=p1;
		//p1 에 담긴 참조값을 Phone type 지역변수 p3 에 담기
		Phone p3=p1;
		//p1 에 담긴 참조값을 Object type 지역변수 p4 에 담기 
		Object p4=p1;
		
		/*
		 * Polymorphism (다형성) => 하나의 객체가 타입이 여러가지일 수 있다.
		 * 상속된 부모의 타입으로 작성할 수 있음.
		 * 
		 * 변수 앞에 타입 값에 대한 사용 설명서의 의미를 지님.
		 * 해당 타입의 메소드만 사용가능 해짐.
		 * 
		 * 부모 타입으로 담으면 프로그래밍이 유연해짐
		 * 자식 객체는 부모 타입이기도 함.
		 */
		
		MainClass02.usePhone(p1);
	}
	
	public static void usePhone(Phone p) { 
		/*
		 * ( ) 안에 들어가는 인자의 의미는 Phone p=p1; 의 개념으로 생각하면 됨.
		 */
		p.call();
		SmartPhone sp=(SmartPhone)p;
		sp.doInternet(); 
	}
}










