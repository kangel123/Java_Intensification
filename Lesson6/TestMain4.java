package Lesson6;

public class TestMain4 {

	public static void main(String[] args) {
		Elevater4 kopo09_elev4;	// Elevater4의 객체 생성
		kopo09_elev4 = new Elevater4();	// 객체 초기화
		System.out.printf("%s\n",kopo09_elev4.kopo09_help);	// 도움말 출력

		for(int i=0;i<10;i++) {	// 10번
			kopo09_elev4.up();	// 올라가는 엘레베이터
			System.out.printf("MSG elev3[%s]\n", kopo09_elev4.kopo09_help);	// 도움말 출력
		}
		
		for(int i=0;i<10;i++) {	// 10버
			kopo09_elev4.down();	// 내려가는 엘레베이터
			System.out.printf("MSG elev3[%s]\n", kopo09_elev4.kopo09_help);	// 도움말 출력
		}
		kopo09_elev4.Repair();	// 수리중인 엘레베이터
		System.out.printf("MSG elev3[%s]\n", kopo09_elev4.kopo09_help);	// 도움말 출력		
	}
}
