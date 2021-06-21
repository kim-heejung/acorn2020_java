package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  1. Bike 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서 참조값을 
		 *     bikes 라는 지역 변수에 담아 보세요.
		 *  2. 배열의 각각의 방(0,1,2번) 에 Bike 객체를 생성해서 담아 보세요.
		 *  3. 반복문 for 를 이용해서 배열의 각각의 방에 있는 Bike 객체의 
		 *     ride() 메소드를 호출해 보세요.
		 */
		Bike[] bikes=new Bike[3];
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		for(int i=0; i<bikes.length; i++) { // for : 반복문, ( ) 안에 조건 => 방의 갯수만큼 반복 문을 돌음, i=0 에서 부터 1 씩 증가 시키겠다, javascript 와 같음.
			//i번째 방에 있는 Bike 객체의 참조값 불러오기
			Bike tmp=bikes[i];
			//Bike 객체의 메소드 호출하기 
			tmp.ride(); 
			// 
			/*
			 * 처음 0 번 방의 참조값이 tmp 에 들어가고  반복문이 끝나면 지역 변수 (임시 변수) tmp 가 사라지고, 
			 * { } 를 빠져나가 1 이 증가 i 가 Bike 객체의 방의 갯수의 수 보다 작을 때 다음 반복문 실행되는 순서임.
			 * 반복문이 끝나면 i, tmp, 지역 변수 bikes 도 사라지면서 프로세스가 종료됨.
			 * 
			 * 범위 => bikes 는 main 메소드 안에서만, i 는 for 문 안에서 tmp 는 { } 안에서만 사용가능한 것임
			 */
		}
	}
}












