package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String line=scan.nextLine();
		String result=line.trim();
		
		System.out.println(result);
	}
}
