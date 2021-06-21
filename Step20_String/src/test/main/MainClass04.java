package test.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 두가지는 정규표현식 패키지 제공해주는 것, 정규 표현식에 관련된 세부적인 작업을 하기 위해서 사용해야함.

public class MainClass04 {
	public static void main(String[] args) {
		String line="2021-05-18 12:10";
		// 숫자만 찾을 정규 표현식
		String reg="[0-9]+"; // \d 도 같은 뜻, 자바에선 "[\\d]" 로 사용.
		// 정규 표현식을 이용해서 Pattern 객체를 얻어낸다.
		Pattern pat=Pattern.compile(reg); // static 메소드, Pattern 리턴.
		// 사용할 정규 표현식을 인자로 전달해주고,
		// Pattern 객체의 matcher() 메소드를 이요해서 Matcher 객체를 얻어낸다.
		Matcher mat=pat.matcher(line); // Matcher 타입 리턴, ( ) 안에 String 넣어주면 됨.
		// 정규 표현식을 사용할 대상의 문자열을 인자로 전달해준다.
		while(mat.find()) { // find : 매치된 값이 있으면 true 없으면 false 반환.
			String result=mat.group(); // group : 매치된 값을 반환.
			System.out.println(result);
			// 정규 표현식에 만족하는것들만 문자열에서 다 찾아낸것.
		}
		System.out.println("메소드가 종료됩니다.");
	}
}
