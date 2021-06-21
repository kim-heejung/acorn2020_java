package test.study;

import java.io.InputStream;
import java.util.Scanner;

public class MyMain02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		/*
		 * 콘솔창으로 사용자 입력을 받아서 활용하고 싶다면?
		 * Scanner 객체를 생성해서 메소드를 이용해야 한다
		 */
		//콘솔창으로부터 입력받을 수 있는 객체의 참조값을 is 라는 지역 변수에 담기
		InputStream is=System.in; // in => static field
		//지역 변수에 담긴 값을 생성자의 인자로 전달해서 Scanner 객체 생성하기
		Scanner scan=new Scanner(is);
		// 콘솔창으로부터 입력받을수 있는 inputStream 객체의 참조값을 전달해줘야 함.
		/*
		 * 위에 두줄을 한줄의 코드로 작성하면
		 * Scanner scan2=new Scanner(System.in);
		 */ 
		
		System.out.print("문자열 입력:");
		/*
		 * println() 을 사용하면 개행기호가 나와서 아래 입력할수 있고,
		 * print() 는 옆에 입력할 수가 있음.
		 */
		String str=scan.nextLine(); // nextLine : 콘솔창으로부터 입력받은 값을 String 타입으로 리턴해줌.
		System.out.println("str:"+str);
		// 
		
		
		
		
	}
}
