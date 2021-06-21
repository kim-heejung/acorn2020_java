package test.main;
/*
 *  [ 기본 data type 의 참조 data type ]
 *  
 *  byte   : Byte
 *  short  : Short
 *  int    : Integer
 *  long   : Long
 *  
 *  float  : Float
 *  double : Double
 *  
 *  char   : Character
 *  boolean: Boolean
 *  
 *  참조 데이터는 대문자로 시작함 => class 가 있다는 것임.
 *  
 *  기본 데이터 타입을 참조 데이터 타입으로 써야할 때가 있음.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조 데이터 type 이지만 기본 데이터 type 처럼 사용할수 있다
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//숫자를 문자로 바꾸기   10 => "10" 
		String strNum=num2.toString();
		// toString() : 숫자를 String 타입으로 리턴해줌.
		
		//문자를 숫자로 바꾸기
		String strNum2="999";
		int result4=Integer.parseInt(strNum2);
		/*
		 * parseInt() : 문자 값을 인자로 전달하면 숫자 타입으로 리턴해줌.
		 * 당연히 숫자 형태로 바꿀수 있는 글자여야함 " " 안에 숫자.
		 */
	}
}






