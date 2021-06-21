package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202104/myFolder/memo.txt");
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재 하지 않습니다.");
				return; //메소드 끝내기 
			}
			//파일에서 문자열을 읽어들일 객체
			FileReader fr=new FileReader(memoFile);
			BufferedReader br=new BufferedReader(fr);
			/*
			 * FileReader 는 try catch 문을 사용하지 않으면 exception 이 일어나고,
			 * BufferedReader 는 생성하면서 인자로 FileReader 를 전달해줘야하므로 FileReader 객체 생성후에 생성해주어야함. 
			 */
			
			// 이클립스야 아래의 2줄의 코드를 더 이상 읽을 문자열이 없을때까지 반복해줘~
			while(true) { // true 면 반복 실행.
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




