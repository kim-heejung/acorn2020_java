package test.mypac;

public class Member {
	//non static 필드 정의하기
	public int num;
	public String name;
	public String addr;
	
	//non static 메소드 정의하기
	public void showInfo() {
		System.out.println(this.num+" | "+this.name+" | "+this.addr); 
		// 메소드 안에서 자기 자신의 필드를 참조할 수 있음 => this 사용하면 됨, javascript 의 this 와 거의 같음.
	}
}






