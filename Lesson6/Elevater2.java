package Lesson6;

public class Elevater2 { // 메인 메소드가 없는 클래스
	public int kopo09_limit_up_floor; // 최상위 층, public : Elevater3를 위해 바꿈
	public int kopo09_limit_down_floor; // 최하위 층
	public int kopo09_floor; // 현재 층
	public String kopo09_help; // 도움말

	Elevater2() { // 생성자(Constructor), 아무 조건 없을 시 기본 정보
		kopo09_limit_up_floor = 10; // 최대 10층
		kopo09_limit_down_floor = 1; // 최소 1층
		kopo09_floor = 1; // 현재 1층
		kopo09_help = "엘레베이터 기본 준공완료";	// 메시지
	}

	Elevater2(int kopo09_up_floor, int kopo09_d_floor, int kopo09_in_floor) { // 생성자(Constructor), 조건이 있는 경우
		kopo09_limit_up_floor = kopo09_up_floor;	// 최대층
		kopo09_limit_down_floor = kopo09_d_floor;	// 최소층
		kopo09_floor = kopo09_in_floor;	// 현재층
		kopo09_help = "엘레베이터 맞춤 준공완료";	// 메시지
	}

	void up() { // 조건이 없으면 1층씩 올라가는 엘리베이터
		if (kopo09_floor == kopo09_limit_up_floor) { // 현재 최상위 층이면
			kopo09_help = "마지막층입니다";
		} else { // 현재 최상위 층이 아니면
			kopo09_floor++; // 층수 증가
			kopo09_help = String.format("[%d]층입니다", kopo09_floor); // 메시지
		}
	}

	void down() { // 조건이 없으면 1층씩 내려가는 엘리베이터
		if (kopo09_floor == kopo09_limit_down_floor) { // 현재 최하위 층이면
			kopo09_help = "처음층입니다";
		} else { // 현재 최하위 층이 아니면
			kopo09_floor--; // 층수 감소
			kopo09_help = String.format("[%d]층입니다", kopo09_floor); // 메시지
		}
	}

	void up(int kopo09_u) { // 여러층 올라가는 엘리베이터.
		// this는 인스턴스 자기 자신을 가리키는 키워드. 밑에서는 없어도 무방
		for (int kopo09_i = 0; kopo09_i < kopo09_u; kopo09_i++)
			this.up(); // 조건만큼 층을 올라감
	}

	void down(int kopo09_u) { // 여러층 올라가는 엘리베이터.
		for (int kopo09_i = 0; kopo09_i < kopo09_u; kopo09_i++)
			down(); // 조건만큼 층을 내라감
	}

	void msg(String id) {	// 현재 층 정보 출력
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", id, kopo09_help, kopo09_limit_up_floor,
				kopo09_limit_down_floor, kopo09_floor);	// 최대층, 최소층, 현재층
	}
}
