package test.study;

import java.util.Random;

public class MyMain01 {
	public static void main(String[] args) {
		/*
		 *  랜덤한 무작위 숫자를 얻어내고 싶다면
		 *  Random 객체를 활용해야 한다.
		 *  따라서 new Random() 해서 객체를 생성 후
		 *  객체의 메소드를 이용해서 무작위 숫자를 얻어내보자
		 */
		Random ran=new Random();
		boolean isRun=ran.nextBoolean();
		System.out.println(isRun);
		// int 범위 안에서 랜덤한 정수 얻어내기
		int num1=ran.nextInt();
		// 0~4 에서 랜덤한 정수 얻어내기
		int num2=ran.nextInt(5);// () 범위 안에서 랜덤한 수를 얻어냄
		// 10~20 사이의 랜덤한 정수 얻어내기
		int num3=ran.nextInt(11)+10;
		// 75~100 사이의 랜덤한 정수 얻어내기
		int num4=ran.nextInt(26)+75;
		// -15~15 사이의 랜덤한 정수
		int num5=ran.nextInt(31)-15; // ( ) 안에 숫자가 나올 정수의 갯수이고 +, - 가 그 값을 만들기 위한 수라고 생각하면 됨
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		System.out.println("num5:"+num5);
		
		
	}
}
