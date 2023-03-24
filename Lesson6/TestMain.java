package Lesson6;

public class TestMain {

	private static int kopo09_inVal; // 다른 클래스에서는 사용불가능한 int형

	// 난 그냥 메소드
	public static void up() {
		kopo09_inVal++;	// kopo09_inVal 값 증가
		System.out.printf("난 그냥 메소드[%d]\n", kopo09_inVal);
	}

	public static void main(String[] args) {
		kopo09_inVal = 0;	// kopo09_inVal 값을 0으로 초기화
		Elevater kopo09_elev;	// 클래스를 받아 객체 생성
		kopo09_elev = new Elevater(); // 새 인스턴트를 생성해 객체에 연결
		
		up();	// 현재 클래스의 메소드(난 그냥 메소드) 호출
		
		for(int i=0;i<10;i++) {
			kopo09_elev.up();	// Elevater클래스의 up메소드(올라가는 엘레베이터)를 호출

			System.out.printf("MSG[%s]\n", kopo09_elev.kopo09_help);	// Elevater클래스의 kopo09_help변수 호출
		}
		
		for(int i=0;i<10;i++) {
			kopo09_elev.down();	// Elevater클래스의 down메소드(내려가는 엘레베이터)를 호출

			System.out.printf("MSG[%s]\n", kopo09_elev.kopo09_help);	// Elevater클래스의 kopo09_help변수 호출
		}
	}

}
