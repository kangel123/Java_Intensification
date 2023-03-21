package JavaIntensification4;

public class DrawGraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spacing();
		makeSinGrap();
		makePyramid();
		double length = 1;
		length *= Math.PI;
	}

	// Spacing using a double for statement
	public static void Spacing() {
		for (int kopo09_row = 0; kopo09_row < 10; kopo09_row++) { // row repeats from 0 to 9
			for (int kopo09_column = 0; kopo09_column < kopo09_row; kopo09_column++)
				System.out.printf(" "); // Column starts at 0. If the row is greater than the column, print blank.
										// Otherwise add 1 to column
			System.out.printf("%d\n", kopo09_row); // Print value of row
		}
	}

	public static void makeSinGrap() {
		double fSin;
		for (int i = 0; i < 360; i++) {
			fSin = Math.sin(i * 3.141592 / 180);
			System.out.printf("%d sin ==>%f\n", i,fSin);
		}
		
		for(int i = 0; i < 360; i++) {
			fSin = Math.sin(i * 3.141592 / 180);
		}
	}

	public static void makePyramid() {

	}

}
