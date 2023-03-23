package Lesson6;

public class MethodTest2 {
	
	static int iStatic;	// int형 전역변수 선언
	
	public static void add(int i) {
		iStatic++;
		i++;
	}
	
	public static int add2(int i) {
		iStatic++;
		i++;
		
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMain;	// int형 지역변수 선언
		
		iMain = 1;
		iStatic = 1;
		
		System.out.printf("******************************\n");
		System.out.printf("메소드 호출전 메인에서 iStatic=[%d]\n", iStatic);	// 1
		System.out.printf("메소드 호출전 메인에서 iMain=[%d]\n", iMain);	// 1
		System.out.printf("******************************\n");
		
		add(iMain);	// add메소드 호출. 전역변수만 변경. 지역변수 변경x
		
		System.out.printf("******************************\n");
		System.out.printf("메소드 호출전 메인에서 iStatic=[%d]\n", iStatic);	//2
		System.out.printf("메소드 호출전 메인에서 iMain=[%d]\n", iMain);	//1
		System.out.printf("******************************\n");
		
		iMain=add2(iMain);	// iMain을 매개변수로 사용해서 증가한 iMain을 받음. 전역변수도 증가
		
		System.out.printf("******************************\n");
		System.out.printf("메소드 호출전 메인에서 iStatic=[%d]\n", iStatic);	//3
		System.out.printf("메소드 호출전 메인에서 iMain=[%d]\n", iMain);	//2
		System.out.printf("******************************\n");
		
	}

}
