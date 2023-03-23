package Lesson6;

public class Elevater2 { // 메인 메소드가 없는 클래스
	public int limit_up_floor; // 최상위 층, public : Elevater3를 위해 바꿈
	public int limit_down_floor; // 최하위 층
	public int floor; // 현재 층
	public String help;	// 도움말

	Elevater2() { // 생성자(Constructor), 아무 조건 없을 시 기본 정보
		limit_up_floor = 10;
		limit_down_floor = 1;
		floor = 1;
		help = "엘레베이터 기본 준공완료";
	}

	Elevater2(int up_floor, int d_floor, int in_floor) { // 생성자(Constructor), 조건이 있는 경우
		limit_up_floor = up_floor;
		limit_down_floor = d_floor;
		floor = in_floor;
		help = "엘레베이터 맞춤 준공완료";
	}

	void up() { // 조건이 없으면 1층씩 올라가는 엘리베이터
		if (floor == limit_up_floor) { // 현재 최상위 층이면
			help = "마지막층입니다";
		} else { // 현재 최상위 층이 아니면
			floor++; // 층수 증가
			help = String.format("[%d]층입니다", floor);	// 메시지
		}
	}

	void down() { // 조건이 없으면 1층씩 내려가는 엘리베이터
		if (floor == limit_down_floor) { // 현재 최하위 층이면
			help = "처음층입니다";
		} else { // 현재 최하위 층이 아니면
			floor--; // 층수 감소
			help = String.format("[%d]층입니다", floor);	// 메시지
		}
	}

	void up(int u) { // 여러층 올라가는 엘리베이터.
		// this는 인스턴스 자기 자신을 가리키는 키워드. 밑에서는 없어도 무방
		for (int i = 0; i < u; i++) this.up();	// 조건만큼 층을 올라감
	}

	void down(int u) { // 여러층 올라가는 엘리베이터.
		for (int i = 0; i < u; i++) down();		// 조건만큼 층을 내라감
	}
	
	void msg(String id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", id, help, limit_up_floor, limit_down_floor, floor);
	}
}
