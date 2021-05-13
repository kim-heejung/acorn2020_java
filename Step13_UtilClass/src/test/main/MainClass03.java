package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//String type  을 저장할 ArrayList 객체 생성하고 
		//참조값을 List 인터페이스 type 지역변수 msgs 에 담기
		List<String> msgs=new ArrayList<String>();
		msgs.add("김구라");
		msgs.add("해골");
		msgs.add("원숭이");
		msgs.add("주뎅이");
		msgs.add("덩어리");
		
		// msgs 의 방의 크기만큼 반복문을 돌면서
		for(int i=0; i<msgs.size(); i++) {
			// i번째 방에 저장된 아이템 불러오기
			String tmp=msgs.get(i);
			// 처음에 generic class 를 잘 적어주면 됨.
			System.out.println(tmp);
		}
		
		System.out.println("----------");
		
		for(String tmp:msgs) {
			// List<String> 이기 때문에 String. generic class 만 잘 적어주면 됨.
			System.out.println(tmp);
		}
	}
}





