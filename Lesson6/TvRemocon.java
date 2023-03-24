package Lesson6;

public class TvRemocon {

	int kopo09_vol = 10;	// 현재 소리크기
	int kopo09_maxVol = 20;	// 최대 소리크기
	int kopo09_minVol = 0;	// 최소 소리크기
	int kopo09_channel = 45;	// 현재 채널번호
	int kopo09_maxChannel = 50;	// 최대 채널번호
	int kopo09_minChannel = 1;	// 최소 채널번호


	public void VolUp() {	// 소리 키우는 메소드
		if(kopo09_vol==kopo09_maxVol) {	// 이미 최대 크기이면
			System.out.printf("현재 소리크기가 최대입니다.\n");
		} else {	// 최대 크기가 아니면
			kopo09_vol++;	// 1씩 증가
			System.out.printf("소리크기는 %d입니다\n", kopo09_vol);
		}
	}
	
	public void VolDn() {	// 소리 키우는 메소드
		if(kopo09_vol==kopo09_minVol) {	// 이미 최소 크기이면
			System.out.printf("현재 소리크기는 0입니다.\n");
		} else {	// 최소 크기가 아니면
			kopo09_vol--;	// 1씩 감소
			System.out.printf("소리크기는 %d입니다\n", kopo09_vol);
		}
	}
	
	public void ChannelUp() {	// 채널을 올리는 메소드
		if(kopo09_channel==kopo09_maxChannel) {	// 현재 최대 채널이면
			kopo09_channel = kopo09_minChannel;	// 가장 낮은 번호의 채널로 이동
			System.out.printf("현재 채널은 %d입니다\n", kopo09_channel);
		} else {	// 현재 최대 채널이 아니면
			kopo09_channel++;	// 1씩 증가
			System.out.printf("현재 채널은 %d입니다\n", kopo09_channel);
		}
	}
	
	public void ChannelDn(){	// 채널을 내리는 메소드
		if(kopo09_channel==kopo09_minChannel) {	// 현재 최소 채널이면
			kopo09_channel = kopo09_maxChannel;	// 가장 높은 번호의 채널로 이동
			System.out.printf("현재 채널은 %d입니다\n", kopo09_channel);
		} else {	// 현재 최소 채널이 아니면
			kopo09_channel--;	// 1씩 감소
			System.out.printf("현재 채널은 %d입니다\n", kopo09_channel);
		}
	}
}
