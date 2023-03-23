package Lesson6;

public class Elevater3 extends Elevater2 { // Elevater2의 내용을 상속받음 (부모:Elevater2)
	
	void Repair() {	// 수리 중 메시지
		help = String.format("수리중입니다");
	}
	
}
