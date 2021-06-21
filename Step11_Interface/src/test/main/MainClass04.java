package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		Drill d1=()->{ // 위에 표현에 줄인 표현 => 약식.
			System.out.println("벽에 20mm 의 구멍내기");
		};
		
		useDrill(d1);
		useDrill(()->{
			System.out.println("핸드폰에 1mm 구멍내기");
		});
		
		/*
		 * 람다 함수 => Override 해야 할 메소드가 하나만 있을 때에 한해서 사용가능.
		 * ()->{}
		 * 
		 * 메소드를 하나 호출하면서 동작하나를 전달한 형태 javascript 와 비슷.
		 */
		
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}





