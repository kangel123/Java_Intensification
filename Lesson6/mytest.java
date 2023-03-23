package Lesson6;

public class mytest {

	// Elevater2클래스에 대한 3개의 객체 생성
	static Elevater2 elev1;
	static Elevater2 elev2;
	static Elevater2 elev3;

	public static void main(String[] args) {
		elev1 = new Elevater2(); // 기본 엘레베이터
		elev2 = new Elevater2(20, 1, 8); // 1층부터 20층까지. 현재8층
		elev3 = new Elevater2(50, -3, 5); // -3층부터 50층까지. 현재5층

		for (int i = 0; i < 20; i++) {
//			elev1.up();	elev1.msg("1번엘레 한층 오르기");	// 1번 엘레베이터의 경우
//			elev2.up(); elev2.msg("1번엘레 한층 오르기"); 	// 2번 엘레베이터의 경우
			elev3.up(); elev3.msg("1번엘레 한층 오르기"); 	// 2번 엘레베이터의 경우
		}
		for (int i = 0; i < 20; i++) {
//			elev1.up(2); elev1.msg("1번엘레 2층씩 오르기");	// 1번 엘레베이터의 경우
//			elev2.up(2); elev2.msg("1번엘레 2층씩 오르기");	// 2번 엘레베이터의 경우
			elev3.up(2); elev3.msg("1번엘레 2층씩 오르기");	// 3번 엘레베이터의 경우
		}
		for (int i = 0; i < 20; i++) {
//			elev1.down(3);elev1.msg("1번엘레 3층씩 내리기");	// 1번 엘레베이터의 경우
//			elev2.down(3);elev2.msg("1번엘레 3층씩 내리기");	// 2번 엘레베이터의 경우
			elev3.down(3);elev3.msg("1번엘레 3층씩 내리기");	// 3번 엘레베이터의 경우
		}

	}

}
