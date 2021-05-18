package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  -java 에서는 데이터 type 을 명시해서 사용하여야 함.
 *  
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127 <- 표현 가능 범위, 대략적으로만 알아두면 됨.
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647 => 제일 많이 사용.
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  int, long 의 크기만 대략적으로 알아두면 됨.
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 *  
 *  효율적인 메모리 사용을 위해 세분화 시켜놓음.
 */
public class MainClass01 {
	//run 했을때 실행순서가 시작되는 특별한 main 메소드 
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//정수형 변수 선언하고 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		/*
		 *  int type 변수에 byte type 변수에 담긴 내용을 대입한다면?
		 *  - 표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에 
		 *    대입 하는것은 문제가 없다
		 *  - 따라서 에러를 발생 시키지 않는다. 
		 */
		int tmp=iByte;
		
		/*
		 *  표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입 하려면 
		 *  명시적으로 casting 을 해야 한다. 
		 */
		byte tmp2=(byte)iInt; 
		/*
		 * casting : 넓은 범위 type 의 변수를 더 좁은 type 의 변수에 넣을 때 사용.
		 * 작성법 : 좁은 범위 type 변수명=(좁은 범위 type)넓은 범위 type 변수명.
		 */
		
		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d; // d 는 생략 가능.
		double num3=10.3; // d, f 를 붙이지 않으면 double type 으로 간주 됨.
		
		//float type 에 있는 값을  double type 에 담기 
		double tmp3=num1; // 컴퓨터는 실수를 다룰 때 근사값을 쓰기때문에 간혹가다 길게 값이 나옴.
		
		//casting 연산자가 필요하다. 
		float tmp4=(float)num2;
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	// method 밖에서 선언한 변수를 field, method 안에서 선언한 변수를 local variable 이라고 함.
}






