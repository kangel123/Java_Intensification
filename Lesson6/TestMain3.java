package Lesson6;

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevater3 kopo09_elev3;	// Elevater3d의 객체 생성
		kopo09_elev3 = new Elevater3();	// 객체 초기화
		for(int i=0;i<10;i++) {	// 10번
			kopo09_elev3.up();	// 올라가는 엘레베이터
			System.out.printf("MSG elev3[%s]\n", kopo09_elev3.kopo09_help);	// 메시지
		}
		
		for(int i=0;i<10;i++) {	// 10번
			kopo09_elev3.down();	// 내려가는 엘레베이터
			System.out.printf("MSG elev3[%s]\n", kopo09_elev3.kopo09_help);	// 메시지
		}
		kopo09_elev3.Repair();	// 수리하는 중인 엘레베이터
		System.out.printf("MSG elev3[%s]\n", kopo09_elev3.kopo09_help);	// 메시지
	}
}
