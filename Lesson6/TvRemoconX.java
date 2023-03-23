package Lesson6;

public class TvRemoconX extends TvRemocon2{
	public int maxBattery;
	public int minBattery;
	public int battery;
	TvRemoconX(){
		super();
		maxBattery=100;
		minBattery=0;
		battery=50;
	}
	
	void bCheck() {
			System.out.printf("현재 남은 배터리는 %s입니다\n", battery+"%");
		
	}
}
