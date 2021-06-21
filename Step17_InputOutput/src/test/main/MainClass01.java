package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		//키보드와 연결된 InputStrem type 의 참조값을 kbd 라는 지역변수에 담기 
		//InputStream 객체는 1byte 단위 처리 스트림 이다.
		//영문자 대소문자, 숫자, 특수문자만 처리할수 있다. 
		//한글 처리 불가 
		InputStream kbd=System.in; // 키보드와 연결된 inputStream 타입의 객체. 
		System.out.println("입력:");
		try {
			//입력한 키의 코드값 읽어오기 
			int code=kbd.read();
			System.out.println("code:"+code);
			//코드값에 대응되는 문자 얻어내기
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 *	input (입력), output (출력) => 줄여서 IO.
	 *
	 *	-input : 메모리의 정보를 입력하는 것.
	 *	 대상 => keyboard, file, network 등. 
	 *	 
	 *	-output : 메모리의 정보를 출력하는 것.
	 *	 대상 => console, file, network 등.
	 *	메모리는 변수정도라고 생각하면 됨.
	 *
	 *	입력, 출력 데이터의 실체 => 2 진수 8 개로 구성된 byte => 1 byte.
	 *	바이트 알갱이를 입력받는다고 생각하면 좋음, 알갱이 하나당 1byte.
	 *	ex) file 을 입력해서 file 로 출력하면 => file 복사.
	 *	 network 로 입력받아서 file 로 출력하면 => file 다운로드, 반대로는 파일 전송
	 */
}






