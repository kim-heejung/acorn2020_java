package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String line=scan.nextLine();
		// 문자열 양쪽에 공백 제거하기
		String result=line.trim(); // trim : 앞과 뒤에 공백을 제거.
		
		System.out.println(result);
	}
}
