package test.main;

// import test.mypac.Gun; 선생님 예제.
import test.mypac.Weapon;
import test.mypac.Shield;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 여러분이 직접 클래스를 만들고 객체 생성을 해서 
		 * 아래의 useWeapon() 메소드를 호출해 보세요.
		 */
		
		/*
		 * 선생님 예제.
		 * Weapon w=new Gun();
		 * MainClass02.useWeapon(w);
		 * 
		 * 
		 * public static void useWeapon(Weapon w) {
		 * 	w.prepare();
		 * 	w.attack();
		 * }
		 */
		
		Weapon s=new Shield(); // 보통은 추상클래스 type 으로 받음.
		MainClass02.useWeapon(s); // MainClass02 에 있는 useWeapon(Weapon s) 메소드 .
		/* 
		 * Shield w=new Shield(); 으로 적어도 됨.
		 * MainClass02.useWeapon(w) 으로 적어도 됨.
		 */
		}
		
	
	public static void useWeapon(Weapon s) { // 추상클래스의 참조값을 가져오기 위해서 ( ) 안에 Weapon s 가 적힘. 
		s.prepare();
		s.attack();
	}
	
}





