package test.mypac;

public class SmartPhone extends HandPhone{
	//생성자
	public SmartPhone() {
		
		System.out.println("SmartPhone() 생성자 호출됨");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//@Override 는 부모의 메소드를 재정의한 메소드라고 표시 해주는 어노테이션
	@Override
	public void takePicture() {
		//super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
	
	/*
	 * Object < Phone < HandPhone < SmartPhone 의 순서로 상속 되어있음.
	 * 생성자 호출시에 부모의 생성자도 함께 호출되므로 부모의 메소드 사용가능 함 (부모의 생성자가 먼저 호출 자식은 그 다음)
	 * heap 영역에 하나의 참조값 안에 들어 있게됨. 
	 * Override 한 메소드는 덮어쓰기 되므로 HandPhone 에 있는 takePicture() 는 사용할 수 없음.
	 * Override => 메소드 재 정의.
	 * SmartPhone 안에서 Object, Phone, HandPhone 까지 this 사용 가능.
	 * 위에 있는 모든 부모를 가르키는 super 라는 예약어도 있음.
	 * 
	 * Object 는 모든 클래스의 제일 위에 상속되어 있지만 보이지 않음.
	 */
}
