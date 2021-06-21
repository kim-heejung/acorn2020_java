package test.study;

public class MainClass01 {
	//run 했을 때 실행순서가 시작되는 main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		int num1=10;
		num1=20;
		// 한번 값을 넣어준 변수의 값을 바꾸면 바꾼 값으로 바뀜.
		
		byte num2=10;
		num2=20;
		
		//int type 변수에 byte type 변수 안에 있는 값을 대입하기
		num1=num2;
		//byte type 변수에 int type 변수 안에 있는 값 대입?
		//byte num3=num1; 문법오류 (compile 에러)
		
		//(byte) 는 형변환 (casting) 연산자이다
		byte num3=(byte)num1; // casting 사용 시 byte 타입이라고 간주 됨.
		
		double num4=10.1; //묵시적인 double type
		double num5=10.1d; //명시적인 double type
		float num6=10.1f; //float 는 반드시 명시적으로 만들어야 한다
		
		//double type 변수에 float type 변수에 있는 값 대입하기
		num4=num6;
		
		//double type 변수에 있는 값을 float type 에 담을 때는 casting 이 필요하다
		float num7=(float)num4;
	}
}
