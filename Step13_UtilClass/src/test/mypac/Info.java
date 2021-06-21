package test.mypac;

public class Info {
	//필드
	public int num;
	public String name;
	public String addr;
	/* 
	 * filed, constructor, method, class 별 사용가능 접근 지정자.
	 * 
	 * public => 공개.
	 * private => 비공개, 같은 class or 같은 객체 안에서만 접근 가능.
	 * protected => 같은 패키지 or 패키지가 달라도 상속 관계에서 자식에게 공개.
	 * 작성 안함 (default) => 같은 패키지 안에서만 접근가능.
	 * 
	 * -class : public, 작성 안함 (default)
	 *  import 가능 여부.
	 * -filed : public, protected, 작성 안함 (default), private.
	 *  . 찍어서 참조 할 수 있느냐.
	 * -constructor : public, protected, X (default), private.
	 *  new 를 할 수 있느냐.
	 * -method : public, protected, X (default), private.
	 *  . 찍어서 호출 할 수 있느냐.

	 */
}
