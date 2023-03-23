package Lesson6;

public class TestMain {

	private static int inVal; // 다른 클래스에서는 사용불가능한 int형

	// 난 그냥 메소드
	public static void up() {
		inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", inVal);
	}

	public static void main(String[] args) {
		inVal = 0;	// 
		Elevater elev;	// 클래스를 받아 객체 생성
		elev = new Elevater(); // 새 인스턴트를 생성해 객체에 연결
		
		up();	// 현재 클래스의 메소드(난 그냥 메소드) 호출
		
		for(int i=0;i<10;i++) {
			elev.up();	// Elevater클래스의 up메소드(올라가는 엘레베이터)를 호출

			System.out.printf("MSG[%s]\n", elev.help);	// Elevater클래스의 help변수 호출
		}
		
		for(int i=0;i<10;i++) {
			elev.down();	// Elevater클래스의 down메소드(내려가는 엘레베이터)를 호출

			System.out.printf("MSG[%s]\n", elev.help);	// Elevater클래스의 help변수 호출
		}
	}

}
