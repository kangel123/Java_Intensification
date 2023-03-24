package Lesson6;

public class RemoconTest2 {

	public static void main(String[] args) {
		// 2개의 리모콘 생성
		TvRemocon2 kopo09_remocon1 = new TvRemocon2();
		TvRemocon2 kopo09_remocon2 = new TvRemocon2(30, 0, 11, 100, 1, 11); // 최대 볼륨, 최소 볼륨, 현재 볼륨, 최대 채널, 최소 채널, 현재 채널


		// 1번 리모콘 소리 변경
		System.out.printf("1번 리모콘 소리 변경\n");
		kopo09_remocon1.Volmsg(); // 현재 소리크기 출력
		kopo09_remocon1.VolUp(5); // 소리 5번 키우기
		kopo09_remocon1.Volmsg(); // 현재 소리크기 출력
		kopo09_remocon1.VolDn(5); // 소리 5번 줄이기
		kopo09_remocon1.Volmsg(); // 현재 소리크기 출력

		System.out.printf("\n");

		// 1번 리모콘 채널 변경
		System.out.printf("1번 리모콘 채널 변경\n");
		kopo09_remocon1.Channelmsg(); // 현재 채널 출력
		kopo09_remocon1.ChannelUp(10); // 채널 10번 올리기
		kopo09_remocon1.Channelmsg(); // 현재 채널 출력
		kopo09_remocon1.ChannelDn(10); // 채널 10번 내리기
		kopo09_remocon1.Channelmsg(); // 현재 채널 출력
		
		System.out.printf("\n");

		// 2번 리모콘 소리 변경
		System.out.printf("2번 리모콘 소리 변경\n");
		kopo09_remocon2.Volmsg(); // 현재 소리크기 출력
		kopo09_remocon2.VolUp(5); // 소리 5번 키우기
		kopo09_remocon2.Volmsg(); // 현재 소리크기 출력
		kopo09_remocon2.VolDn(5); // 소리 5번 줄이기
		kopo09_remocon1.Volmsg(); // 현재 소리크기 출력

		System.out.printf("\n");

		// 2번 리모콘 채널 변경
		System.out.printf("2번 리모콘 채널 변경\n");
		kopo09_remocon2.Channelmsg(); // 현재 채널 출력
		kopo09_remocon2.ChannelUp(10); // 채널 10번 올리기
		kopo09_remocon2.Channelmsg(); // 현재 채널 출력
		kopo09_remocon2.ChannelDn(10); // 채널 10번 내리기
		kopo09_remocon2.Channelmsg(); // 현재 채널 출력
	}
}
