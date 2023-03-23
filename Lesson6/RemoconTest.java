package Lesson6;

public class RemoconTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon remocon = new TvRemocon();	// TvRemocon 객체 생성
		for(int i=0;i<10;i++) {
			remocon.ChannelUp();
		}
		for(int i=0;i<10;i++) {
			remocon.ChannelDn();
		}
		for(int i=0;i<5;i++) {
			remocon.VolUp();
		}
		for(int i=0;i<5;i++) {
			remocon.VolDn();
		}
	}

}
