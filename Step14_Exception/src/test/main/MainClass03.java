package test.main;

import java.io.File;
import java.io.IOException;

/*
 *  RuntimeException 을 상속 받지 않는 Exception 은 
 *  반드시 try ~ catch 블럭으로 묶어서 예외 처리를 해야한다. 
 */
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		
			try {
				Thread.sleep(5000); // 실행의 흐름을 5 초동안 잡아둠.
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		File f1=new File("c:/acon202104/myFolder/test.txt");
		
			try {
				f1.createNewFile(); // 해당 경로에 test.txt 파일 생성.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}






