package test.mypac;

public class MemberInfo {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//default 생성자
	public MemberInfo() {}
	
	//생성자의 인자로 번호,이름,주소를 전달 받을수 있도록 한다.
	public MemberInfo(int num, String name, String addr) {
		//생성자의 인자로 전달된 값을 필드에 저장한다.
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	/*
	 * 필드는 특별한 이유가 아닌이상 비공개로 사용함,
	 * 필드에서 사용하는 부품을 담고 있기 때문에 공개하면 잘못된 동작을 할 가능성이 있음
	 */
}









