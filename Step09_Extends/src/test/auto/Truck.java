package test.auto;

public class Truck extends Car{
	
	//Engine 객체를 생성자의 인자로 전달받는 생성자
	public Truck(Engine engine) {
		//자식생성자로 받은 객체를 부모 생성자에 전달해 주어야 부모 객체가 생성된다. 
		super(engine); // super() 는 부모생성자를 가리킨다.
		/*
		 * Truck 객체 생성을 위해서는 Car 객체가 먼저 생성이 되야하는데 Car 객체는 인자로 Engine 전달해주어야하므로
		 * Truck 생성자가 Car 생성자에게 값을 전해주어야함 (부모 생성자의 필요한 값이 있으면 자식 생성자에서 값을 받아 전달해주어야 함)
		 * 디폴트 생성자가 있다면 전달해주지 않아도 됨.
		 */
	}
	//메소드 
	public void dump() {
		System.out.println("짐을 쏟아내요");
	}
}





