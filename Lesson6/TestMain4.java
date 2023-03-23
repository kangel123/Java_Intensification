package Lesson6;

public class TestMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevater4 elev4;
		elev4 = new Elevater4();
		System.out.printf("%s\n",elev4.help);

		for(int i=0;i<10;i++) {
			elev4.up();
			System.out.printf("MSG elev3[%s]\n", elev4.help);
		}
		
		for(int i=0;i<10;i++) {
			elev4.down();
			System.out.printf("MSG elev3[%s]\n", elev4.help);
		}
		elev4.Repair();
		System.out.printf("MSG elev3[%s]\n", elev4.help);
		
	}

}
