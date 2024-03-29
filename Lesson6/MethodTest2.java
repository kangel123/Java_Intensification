package Lesson6;

public class MethodTest2 {
	
	static int kopo09_iStatic;	// int형 전역변수 선언
	
	// 전역변수 1씩 증가, 지역변수는 변화x
	public static void add(int kopo09_i) {	// 리턴값x
		kopo09_iStatic++;	// 전역변수 증가
		kopo09_i++;	// 지여변수 증가
		System.out.printf("add메소드에서->iStatic=[%d]\n", kopo09_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", kopo09_i);
	}
	
	// 지역변수와 전역변수 1씩 증가
	public static int add2(int kopo09_i) {	// 리턴값 o
		kopo09_iStatic++;	// 전역변수 증가
		kopo09_i++;	// 지역변수 증가
		System.out.printf("add메소드에서->iStatic=[%d]\n", kopo09_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", kopo09_i);		
		return kopo09_i;	// 매개변수와 리턴값은 같으므로 지역변수도 증가
	}
	
	// 전역변수와 지역변수에 대해서
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo09_iMain;	// int형 지역변수 선언
		
		kopo09_iMain = 1;
		kopo09_iStatic = 1;
		
		System.out.printf("******************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", kopo09_iStatic);	// 1
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", kopo09_iMain);	// 1
		System.out.printf("******************************\n");
		
		add(kopo09_iMain);	// add메소드 호출. 전역변수만 변경. 지역변수 변경x
		
		System.out.printf("******************************\n");
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", kopo09_iStatic);	//2
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n", kopo09_iMain);	//1
		System.out.printf("******************************\n");
		
		kopo09_iMain=add2(kopo09_iMain);	// iMain을 매개변수로 사용해서 증가한 iMain을 받음. 전역변수도 당연히 증가
		
		System.out.printf("******************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n", kopo09_iStatic);	//3
		System.out.printf("메소드 add2호출후 메인에서->iMain=[%d]\n", kopo09_iMain);	//2
		System.out.printf("******************************\n");
		
	}

}
