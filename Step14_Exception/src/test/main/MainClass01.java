package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력:");
		//숫자 형식의 문자열을 입력 받는다.  "10" "20" "10.1" 등등
		String inputNum=scan.nextLine();
		try {
			//입력한 숫자를 실제 숫자로 바꾼다.
			double num=Double.parseDouble(inputNum);
			//입력한 숫자에 100 을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자 + 100 : "+result);
		}catch(NumberFormatException nfe) { 
			// catch( ) 안에
			/*
			 * double num=Double.parseDouble(inputNum); 에서 예외가 발생해서
			 * catch 문으로 실행의 흐름이 뛰게 되고 예외 객체의 참조값이 nfe 로 들어가게 됨.
			 * nfe 는 catch 문에서만 사용가능한 지역변수.
			 */
			System.out.println("Oops!");
			// 예외 메세지 얻어내서
			String msg=nfe.getMessage();
			// 콘솔창에 출력
			System.out.println(msg);
			// 예외 정보를 자동으로 콜솔에 출력하게 하기
			nfe.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	/*
	 * 숫자 이외의 다른 언어로 숫자를 적게 되면 double 로 바꿀 수 없어 오류 exception 발생하며 실행의 흐름이 뜀.
	 * 어떤 예외가 발생할지 예상해서 처리해주면 실행의 흐름이 뛰는걸 방지 할 수 있음.
	 * => try {}catch (){} 문 사용.
	 * 예외 발생할 수 있는 흐름을 try { } 로 묶어주고 catch (){} 의 () 안에 예외 타입, { } 안에 예외 발생시 처리할 동작을 적어주면 됨. 
	 */
}








