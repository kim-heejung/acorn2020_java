package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acon202104/myFolder/memo.txt");
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재 하지 않습니다.");
				return; //메소드 끝내기 
			}
			//파일에서 문자열을 읽어들일 객체
			FileReader fr=new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			
			// 이클립스야 아래의 2줄의 코드를 더 이상 읽을 문자열이 없을때까지 반복해줘~
			while(true) {
				// 개행 기호를 기준으로 한줄씩 읽어온다.
				String line=br.readLine();
				if(line==null) { // 만일 더이상 읽을 문자열이 없다면
					break; // 반복문 탈출
				}
				// 읽은 문자열 한줄씩 출력하기.
				System.out.println(line); // print() 메소드를 사용하면 개행기호는 빼고 출력됨.
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}




