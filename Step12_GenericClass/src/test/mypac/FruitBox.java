package test.mypac;
/*
 *	포괄 클래스
 *   class 클래스명<Generic type>
 *   
 *    - 클래스를 정의할때 Generic type 을 지정해서 특정 type 을 동적으로 지정할수 있다. 
 *    클래스를 정의할 때 구체적인 타입을 적지 않고 변수 형태로 적어놓고, 객체 생성시 구체적인 타입을 기재함.
 */
public class FruitBox<T> {
	//필드 
	private T item;
	//메소드
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
	
	/*
	 * < > 안에 정의한 타입을 필드, 메소드의 인자, 메소드의 리턴타입으로 사용함.
	 * 클래스 안에서 사용하는 타입을 동적으로 전달할 수 있게 함.
	 * 
	 * 임시로 타입이름을 지정해 놓고, 원하는 타입을 받을 수 있음.
	 * 
	 *	generic 을 쓰지 않고 상속받아 다형성을 사용하게 되면 casting 해주어야 함,
	 *	generic 은 쓰지 않아도 됨.
	 */
}
