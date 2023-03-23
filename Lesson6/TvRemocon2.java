package Lesson6;

public class TvRemocon2 {

	public int maxVol;
	public int minVol;
	public int vol;
	public int maxChannel;
	public int minChannel;
	public int channel;
	
	// 기본 티비 정보
	public TvRemocon2() {
		this(20, 0, 10, 50, 1, 20);
	}

	// 지정된 티비 정보
	public TvRemocon2(int maxVol, int minVol, int vol, int maxChannel, int minChannel, int channel) {
		this.maxVol = maxVol;
		this.minVol = minVol;
		this.vol = vol;
		this.maxChannel = maxChannel;
		this.minChannel = minChannel;
		this.channel = channel;
	}

	public void VolUp() { // 소리 키우는 메소드
		if (vol == maxVol) { // 이미 최대 크기이면
		} else { // 최대 크기가 아니면
			vol++; // 1씩 증가
		}
	}

	public void VolDn() { // 소리 키우는 메소드
		if (vol == minVol) { // 이미 최소 크기이면
		} else { // 최소 크기가 아니면
			vol--; // 1씩 감소
		}
	}

	public void ChannelUp() { // 채널을 올리는 메소드
		if (channel == maxChannel) { // 현재 최대 채널이면
			channel = minChannel; // 가장 낮은 번호의 채널로 이동
		} else { // 현재 최대 채널이 아니면
			channel++; // 1씩 증가
		}
	}

	public void ChannelDn() { // 채널을 내리는 메소드
		if (channel == minChannel) { // 현재 최소 채널이면
			channel = maxChannel; // 가장 높은 번호의 채널로 이동
		} else { // 현재 최소 채널이 아니면
			channel--; // 1씩 감소
		}
	}
	
	public void VolUp(int num) {	// num만큼 소리 키우기
		for(int i=0; i < num; i++) VolUp();
	}

	public void VolDn(int num) {	// num만큼 소리 줄이기
		for(int i=0; i < num; i++) VolDn();
	}
	
	
	public void ChannelUp(int num) {	// num만큼 채널 올리기
		for(int i=0; i < num; i++) ChannelUp();
	}

	public void ChannelDn(int num) {	// num만큼 채널 내리기
		for(int i=0; i < num; i++) ChannelDn();
	}

	public void Volmsg() {
		System.out.printf("현재 소리는 %d입니다\n", vol);
	}
	
	public void Channelmsg() {
		System.out.printf("현재 채널은 %d입니다\n", channel);
	}
}
