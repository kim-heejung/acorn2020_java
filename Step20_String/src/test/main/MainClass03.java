package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력(영문자로 시작 특수문자 허용하지 않음) : ");
		String line=scan.nextLine();
		String reg="^[a-zA-Z][\\w]+$"; 
		// $ 는 끝의 의미, 첫번째 글자는 영문 대문자 또는 소문자 두번째글자는 특수문자가 아닌 한글짜가 한번이상 반복되면 됨.
		// String 객체의 matches() 메소를 이용하면 문자열을 정규표현식으로 검증해서 매칭 여부를 알 수 있다, 정규 표현식 사용 가능.
		boolean isMatch=line.matches(reg);
		if(isMatch) {
			System.out.println("제대로 입력했군요");
		}else {
			System.out.println("아이디를 확인하세요");
		}
		
	}
}
