package Lesson6;

public class TvRemocon2 {
	public int kopo09_maxVol;
	public int kopo09_minVol;
	public int kopo09_vol;
	public int kopo09_maxChannel;
	public int kopo09_minChannel;
	public int kopo09_channel;
	
	// 기본 티비 정보
	public TvRemocon2() {
		this(20, 0, 10, 50, 1, 20);	// 아래의 생성자에 해당 값들을 넣는 것과 동일
	}

	// 지정된 티비 정보
	public TvRemocon2(int kopo09_maxVol, int kopo09_minVol, int kopo09_vol, int kopo09_maxChannel, int kopo09_minChannel, int kopo09_channel) {
		this.kopo09_maxVol = kopo09_maxVol;	// 최대 소리크기
		this.kopo09_minVol = kopo09_minVol;	// 최소 소리크기
		this.kopo09_vol = kopo09_vol;	// 현재 소리크기
		this.kopo09_maxChannel = kopo09_maxChannel;	// 최대 채널
		this.kopo09_minChannel = kopo09_minChannel;	// 최소 채널
		this.kopo09_channel = kopo09_channel;	// 현재 채널
	}

	public void VolUp() { // 소리 키우는 메소드
		if (kopo09_vol == kopo09_maxVol) { // 이미 최대 크기이면
		} else { // 최대 크기가 아니면
			kopo09_vol++; // 1씩 증가
		}
	}

	public void VolDn() { // 소리 키우는 메소드
		if (kopo09_vol == kopo09_minVol) { // 이미 최소 크기이면
		} else { // 최소 크기가 아니면
			kopo09_vol--; // 1씩 감소
		}
	}

	public void ChannelUp() { // 채널을 올리는 메소드
		if (kopo09_channel == kopo09_maxChannel) { // 현재 최대 채널이면
			kopo09_channel = kopo09_minChannel; // 가장 낮은 번호의 채널로 이동
		} else { // 현재 최대 채널이 아니면
			kopo09_channel++; // 1씩 증가
		}
	}

	public void ChannelDn() { // 채널을 내리는 메소드
		if (kopo09_channel == kopo09_minChannel) { // 현재 최소 채널이면
			kopo09_channel = kopo09_maxChannel; // 가장 높은 번호의 채널로 이동
		} else { // 현재 최소 채널이 아니면
			kopo09_channel--; // 1씩 감소
		}
	}	
	public void VolUp(int kopo09_num) {	// num만큼 소리 키우기
		for(int kopo09_i=0; kopo09_i < kopo09_num; kopo09_i++) VolUp();
	}

	public void VolDn(int kopo09_num) {	// num만큼 소리 줄이기
		for(int kopo09_i=0; kopo09_i < kopo09_num; kopo09_i++) VolDn();
	}
	
	public void ChannelUp(int kopo09_num) {	// num만큼 채널 올리기
		for(int kopo09_i=0; kopo09_i < kopo09_num; kopo09_i++) ChannelUp();
	}

	public void ChannelDn(int kopo09_num) {	// num만큼 채널 내리기
		for(int kopo09_i=0; kopo09_i < kopo09_num; kopo09_i++) ChannelDn();
	}

	public void Volmsg() {	// 소리 정보
		System.out.printf("현재 소리는 %d입니다\n", kopo09_vol);
	}
	
	public void Channelmsg() {	// 채널 정보
		System.out.printf("현재 채널은 %d입니다\n", kopo09_channel);
	}
}
