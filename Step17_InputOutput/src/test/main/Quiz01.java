package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열 한줄을 입력 받은 다음
		 *  c:/acorn2020/myFolder/quiz.txt 파일을 만들어서 
		 *  해당 파일에 문자열을 저장해 보세요.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("저장할 문자열 입력:");
		String str=scan.nextLine();
		
		File file1=new File("c:/acorn202104/myFolder/quiz.txt");
		try {
			//파일이 존재하는지 알아내서
			boolean isExist=file1.exists();
			if(!isExist) { //만일 존재하지 않는다면
				file1.createNewFile(); //파일을 새로 만든다
			}
			/*
			 * new FileWriter(File 객체, append 모드 여부)
			 * FileWriter fw=new FileWriter(file1, true);
			 * append 모드가 true 라는 것은 문자열의 누적 여부를 어떤걸로 할지 정한다, false 사용시 덮어쓰기 됨.
			 * append 모드를 전달하지 않으면 false 가 default 값
			 */ 
			FileWriter fw=new FileWriter(file1, true);
			//fw.write(str);
			fw.append(str);
			fw.append("\r\n");
			//fw.flush();
			fw.close(); //자동 flush 된다.
			System.out.println("문자열을 저장했습니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}








