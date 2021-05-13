package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 *  test.Mypac 패키지에 Weapon, MyWeapon 참고.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// Weapon type 의 참조값을 얻어내는게 목적.
		Weapon w1=new MyWeapon();
		w1.prepare();
		w1.attack();
	}
}
