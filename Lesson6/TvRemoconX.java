package Lesson6;

public class TvRemoconX extends TvRemocon2 {
	public int kopo09_maxBattery;
	public int kopo09_minBattery;
	public int kopo09_battery;

	TvRemoconX() { // 기본 생성 시
		super(); // 소리크기와 채널은 TvRemocon2의 내용과 동일하게 설정
					// 최대소리 : 20, 최소 소리 : 0, 현재 소리 : 10, 최대 채널 : 50, 최소 채널 : 1, 현재 채널 : 20
		kopo09_maxBattery = 100; // 최대 배터리 100%
		kopo09_minBattery = 0; // 최소 배터리 0%
		kopo09_battery = 50; // 현재 배터리 50%
	}

	void bCheck() {	// 남은 배터리 표시
		System.out.printf("현재 남은 배터리는 %s입니다\n", kopo09_battery + "%");
	}
}
