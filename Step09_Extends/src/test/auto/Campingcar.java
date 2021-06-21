package test.auto;

public class Campingcar extends Car {
	// 생성자
	public Campingcar(Engine engine) {
		super(engine);
	}
	// 메소드
	public void doCamping() {
		// 부모 객체의 메소드 사용 가능, this. 은 생략가능
		this.drive(); // this. 은 생략 가능.
		// 부모 객체의 필드 참조 가능 this. 은 생략가능
		Engine e=this.engine;
	}
}
