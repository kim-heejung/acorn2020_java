package test.main;
/*
 *  [ Java 참조 데이터 type ]
 *  
 *  String type
 *  
 *  - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		// "김구라" 정보를 담고 있는 참조값(id값) 이 변수에 들어간다. 
		String name="김구라";
		String tmp=name; // 참조값 복사해 주기 
		name="원숭이"; // 새로운 참조값으로 대입하기
		name=null; // name 변수를 empty(빈) 상태로 만들기 
	}
}

/*
 * data type 종류
 * 
 * 1. primitive data type (기본 데이터 타입) : 실제 값을 가지고 있음.
 * -byte, short, int, long, float, double, boolean, char.
 * 
 * 2. reference data type (참조 데이터 타입) : 참조값 (=id 값) 을 가지고 있음.
 * -String type 등.
 * 무한대로 많음.
 */




