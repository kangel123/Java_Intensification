package Lesson6;

public class Elevater4 extends Elevater2{
	Elevater4(){	// 기본 생성자
		super();	// Elevater2의 정보와 동일(최대 10층, 최소 1층, 현재 1층)
		kopo09_help="엘레베이터 준공완료";	// 도움말 변경
	}
	
	void Repair() {	// 수리 중 메시지
		kopo09_help = String.format("수리중입니다");	// 도움말 변경
	}
	
	void up() { // 2칸 올라가고 1칸 내려가는 엘레베이터
		if (kopo09_floor >= kopo09_limit_up_floor) { // 현재 최상위 층이면
			kopo09_help = "마지막층입니다";
		} else { // 현재 최상위 층이 아니면
			kopo09_floor+=2; // 2씩 올라감
			kopo09_help = String.format("%d층입니다", kopo09_floor);	// 메시지
		}
		this.down();	// 현재 클래스의 down메소드 호출
	}

	void down() { // 1층 내려가는 엘레베이터
		super.down();	// Elevater2의 down메소드 실행, 1칸 내려옴
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.kopo09_help);
	}	
}
