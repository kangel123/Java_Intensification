package Lesson6;

public class RemoconTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon kopo09_remocon = new TvRemocon(); // TvRemocon의 객체 생성

		System.out.printf("채널 올리기\n");
		for (int kopo09_i = 0; kopo09_i < 5; kopo09_i++) {	// 5번 반복
			kopo09_remocon.ChannelUp();	// 채널 올리기
		}
		
		System.out.printf("\n채널 내리기\n");
		for (int kopo09_i = 0; kopo09_i < 5; kopo09_i++) {	// 5번 반복
			kopo09_remocon.ChannelDn();	// 채널 내리기
		}

		System.out.printf("\n소리크기 키우기\n");
		for (int kopo09_i = 0; kopo09_i < 10; kopo09_i++) {		// 10번 반복
			kopo09_remocon.VolUp();	// 소리 키우기
		}

		System.out.printf("\n소리크기 줄이기\n");
		for (int kopo09_i = 0; kopo09_i < 10; kopo09_i++) {	// 10번 반복
			kopo09_remocon.VolDn();	// 소리 줄이기
		}
	}
}
