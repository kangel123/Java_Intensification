package Lesson6;

public class TvRemocon {

	int vol = 10;
	int maxVol = 20;
	int minVol = 0;
	int channel = 45;
	int maxChannel = 50;
	int minChannel = 1;


	public void VolUp() {	// 소리 키우는 메소드
		if(vol==maxVol) {	// 이미 최대 크기이면
			System.out.printf("현재 소리크기가 최대입니다.\n");
		} else {	// 최대 크기가 아니면
			vol++;	// 1씩 증가
			System.out.printf("소리크기는 %d입니다\n", vol);
		}
	}
	
	public void VolDn() {	// 소리 키우는 메소드
		if(vol==minVol) {	// 이미 최소 크기이면
			System.out.printf("현재 소리크기는 0입니다.\n");
		} else {	// 최소 크기가 아니면
			vol--;	// 1씩 감소
			System.out.printf("소리크기는 %d입니다\n", vol);
		}
	}
	
	public void ChannelUp() {	// 채널을 올리는 메소드
		if(channel==maxChannel) {	// 현재 최대 채널이면
			channel = minChannel;	// 가장 낮은 번호의 채널로 이동
			System.out.printf("현재 채널은 %d입니다\n", channel);
		} else {	// 현재 최대 채널이 아니면
			channel++;	// 1씩 증가
			System.out.printf("현재 채널은 %d입니다\n", channel);
		}
	}
	
	public void ChannelDn(){	// 채널을 내리는 메소드
		if(channel==minChannel) {	// 현재 최소 채널이면
			channel = maxChannel;	// 가장 높은 번호의 채널로 이동
			System.out.printf("현재 채널은 %d입니다\n", channel);
		} else {	// 현재 최소 채널이 아니면
			channel--;	// 1씩 감소
			System.out.printf("현재 채널은 %d입니다\n", channel);
		}
	}
	
	
}
