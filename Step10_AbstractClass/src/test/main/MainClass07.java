package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	
	// run 했을때 실행순서가 시작되는 특별한 main 메소드 
	public static void main(String[] args) {
		/*
		 *  Weapon 추상 클래스를 상속받은 익명의 local inner class 
		 *  의 생성자를 호출해서 Weapon type 의 참조값 얻어내서 지역변수 w1 에 담기 
		 */
		Weapon w1=new Weapon() { 
			/*
			 * anonymous inner class.
			 * Weapon() 뒤에 { } (중괄호) class 를 의미 => 익명의 class (anonymous class)
			 * new 클래스이름() 적을 시 해당 클래스를 상속 받겠다는 뜻이며, 생성자를 호출하겠다는 뜻도 담고 있음. 
			 * 추상 클래스의 참조값을 얻기위해 약식으로 작성한 방법.
			 */
			// 
			@Override
			public void attack() {
				System.out.println("아무나 공격해요!");
			}
		};
		
		Weapon w2=new Weapon() {
			@Override
			public void attack() {
				System.out.println("공중 공격을 해요!");
			}
		};
		
		useWeapon(w1); // MainClass07. 생략 가능.
		useWeapon(w2);
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("지상 공격을 해요!");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}






