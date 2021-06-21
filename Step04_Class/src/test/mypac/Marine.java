package test.mypac;

public class Marine {
	//공격력을 저장하고 있는 static 필드 
	public static int attackPower=6; // static 필드는 static 영역에 만들어 졌으므로 클래스명을 사용해 접근해야함.
	//에너지를 저장하고 있는 non static 필드
	public int energy=40; // non static 은 참조값으로 접근
	
	//움직이는 메소드
	public void move() {
		System.out.println("마린이 움직여요");
	}
	//공격하는 메소드
	public void attack() {
		System.out.println(Marine.attackPower+" 의 공격력으로 공격을 해요");
	}
	//현재 에너지를 출력하는 메소드
	public void showEnergy() {
		System.out.println("현재 에너지:"+this.energy); 
		// non static 은 heap 영역에 만들어져서 참조값을 이용해 접근하는데 메소드 안에서 자신의 필드를 this 로 참조 가능하기 때문에 사용됨. 
	}
}






