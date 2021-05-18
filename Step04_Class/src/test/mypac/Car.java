package test.mypac;

/*
 *  [ 클래스의 용도 ]
 *  
 *  1. 객체의 설계도 역할을 한다.
 *  객체는 field (저장소) 와 method (기능) 으로  이루어져 있기 때문에.
 *  2. 데이터 type 의 역할을 한다.
 *  3. static 필드나 static 메소드를 가지고 있는 역활을 한다.
 *  
 *  new : 설계도를 가지고 물건을 만들어 내는 일 => 객체 생성.
 *  작성법 : new 클래스 이름().
 */

public class Car {
	//자동차의 이름을 저장할 필드 
	public String name; 
	// 필드 중 참조 data type 인경우 선언만하고 값을 넣지 않아도 자동으로 기본값 null 이 들어감.
	
	//달리는 메소드
	public void drive() {
		System.out.println("부릉 부릉 달려요~");
	}
}














