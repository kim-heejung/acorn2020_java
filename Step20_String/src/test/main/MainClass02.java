package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String str="abcde김구라12345";
		// 4 번째 인덱스에 있는 문자 얻어오기, 0 부터 시작.
		char a=str.charAt(4); 
		// 문자열 합치기.
		String b=str.concat("fghij");
		// 문자열이 포함되어 있는지 여부 얻어내기.
		boolean c=str.contains("123");
		// CharSequence => String 을 상속 받음.
		// 해당 문자열이 몇번째 인덱스에 있는지 알아내기, 시작 위치.
		int d=str.indexOf("김구라"); // '김구라' 가 없으면 -1 을 리턴함.
		// 문자열의 길이 얻어내기.
		
		// 정규 표현식으로 문자열을 분리해서 String[] 로 얻어내기.
		int e=str.length();
		String line="김구라/해골/원숭이/주뎅이/덩어리";
		String[] result1=line.split("/"); // ( ) 안에 정규 표현식 사용가능 => '/' 로 구분된 걸 String 배열에 담음.

		String line2="김구라     해골     원숭이     주뎅이     덩어리";
		String[] result2=line2.split("[ ]+"); // [ ]+ => 공백이 한번 이상.
		/*
		 *	정규 표현식
		 *
		 *	[] => 한글자
		 *
		 *	반복자 : +, *, ?
		 *	+ => 1번 이상.
		 *	* => 0번 이상.
		 *	? => 0 or 1.
		 *
		 *	^ => 대괄호 밖 => 시작, 대활호 안 => 밖.
		 */
		
		String line3="김구라abcd ef해골 asbd4 원숭이  주뎅이  mdfks 덩어리";
		String[] result3=line2.split("[a-z0-9 ]+"); // a 에서부터  z, 0 에서 9, 혹은 공백.
		
		String line4="김구라바보,해골바보,원숭이바보";
		String result4=line4.replaceAll("바보", "천재"); // 정규 표현식으로 표현가능, 특정패턴을 특정 단어로 바꾸는것도 가능.
		
		String line5="abc   가나123  efg @!$ def 456";
		String result5=line5.replaceAll("[A-Za-z0-9]", ""); // 특수문자 (줄인표현 => \w, java 는 \\w 역슬래시 두개넣어야함) 를 빈문자로 만들겠다는 의미.
		/*
		 *	in javascript => /[^\w]/;
		 *	in java => "[^\\w]"
		 *
		 *	in javascript => /a\\b/ => a\b 를 찾는 것, 정규 표현식의 역슬래시를 특별한 기호로 해석하지 말라는 뜻.
		 *	in java => "a\\\\b"
		 *
		 *	-java 에서 정규표현식을 작성할 때 역슬래시를 하나 넣고 싶으면 2개를 넣으면 됨 => 두개당 하나.
		 *	문자열에 역슬래시를 넣으면 특별한 기호로 해석하기 때문에.
		 */
		String result6=line5.replaceAll("[\\w]", ""); 
		String result7=line5.replaceAll("[\\W]", ""); // 위에 코드의 반대 개념, [^\\w] 와 같은 의미.
	}
}
