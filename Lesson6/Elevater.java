package Lesson6;

public class Elevater {	// 메인 메소드가 없는 클래스
	int limit_up_floor = 10;	//최상위 층
	int limit_down_floor = 0;	//최하위 층
	int floor = 1;	// 현재 층
	String help;
	
	void up() {	// 1층씩 올라가는 엘리베이터. 앞에 아무것도 없으면 public
		if(floor==limit_up_floor) {	// 현재 최상위 층이면
			help="마지막층입니다";
		} else {	// 현재 최상위 층이 아니면
			floor++;	// 층수 증가
			help = String.format("%d층입니다", floor);
		}
	}
	
	void down() {	// 1층씩 내려가는 엘리베이터. 앞에 아무것도 없으면 public
		if(floor==limit_down_floor) {	// 현재 최하위 층이면
			help="처음층입니다";
		} else {	// 현재 최하위 층이 아니면
			floor--;	//층수 감소
			help = String.format("%d층입니다", floor);
		}
	}
}
