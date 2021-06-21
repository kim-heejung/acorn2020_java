package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202104/myFolder/memo.txt");
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재 하지 않습니다.");
				return; //메소드 끝내기 
			}
			//파일에서 문자열을 읽어들일 객체
			FileReader fr=new FileReader(memoFile);
			/*
			 * memo.txt 파일에 몇개의 문자가 있는지는 잘모름
			 * 아래 3줄의 코드를 memo.txt 파일에 있는 모든 문자를 읽어올 때까지 반복 수행하고 싶음.
			 */
			//이클립스 (JVM) 야 아래의 세줄 코드를 code 값이 -1 이 나올때까지 반복 수행해줘~
			while(true) {
				// read() 메소드를 이요해서 읽은 문자의 코드값을 얻어낸다.
				int code=fr.read();
				if(code==-1) { 
					/*
					 * read() 메소드 중에서는 String 타입으로 리턴해주는 메소드는 없음.
					 * 
					 * read () 메소드는 다읽었다면 -1 을 리턴함.  
					 */ 
					break; // 반복문 탈출
				}
				// 코드값에 해당하는 문자 얻어내기
				char ch=(char)code;
				// 문자 출력하기
				System.out.print(ch);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}




