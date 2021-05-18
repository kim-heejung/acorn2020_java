package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	//staic inner class 로 Weapon 추상 클래스 상속 받기 
	public static class YourWeapon extends Weapon{ // 내부 class 에 한해서 static 예약어를 붙일 수 있음.
		@Override
		public void attack() {
			System.out.println("아무나 공격해요");
		}	
	}
	
	public static void main(String[] args) {
		/*
		 *  useWeapon() 메소드를 호출하는게 목적이다.
		 *  호출하려고 보니 Weapon 추상 클래스 type 객체의 참조값이 필요하다
		 *  따라서 Weapon 추상 클래스를 상속받은 클래스를 파일로 만들어야 된다.
		 *  근데 불금이다보니 만사가 구찮다. 클래스를 파일로 만들기 싫다
		 *  내부클래스(inner class) 로 만들고 싶다. 		 
		 */
		Weapon w1=new YourWeapon(); // static 메소드 안에서는 내부 class 조차도 static 이 붙지 않으면 사용 불가능.
		useWeapon(w1);
		
		//local inner class 도 이용해 보자
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("지겹다 이제 그만 공격하자");
			}
		}
		
		Weapon w2=new OurWeapon();
		useWeapon(w2);
		
	}
	
	public static void useWeapon(Weapon w) { // Weapon 뒤에 w 는 중요한 의미를 지니지 않음, w1, w2 두 가지를 받아옴.
		w.prepare();
		w.attack();
	}
}






