package JavaIntensification4;

public class DrawGraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Spacing();
//		makeSinGrap();
		makePyramid();
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
			fSin = Math.sin(i * 3.141592 / 180);	// pi 생략 된 값(1/2) = sin(pi/2)
			System.out.printf("%d sin ==>%f\n", i, fSin);
		}

		for (int i = 0; i < 360; i++) {
			fSin = Math.sin(i * 3.141592 / 180);
			
			int iSpace = (int) ((1.0 - fSin) * 50);
			for (int j = 0; j < iSpace; j++) System.out.printf(" ");
			System.out.printf("*[%f][%d]\n", fSin, iSpace);
		}
	}

	public static void makePyramid() {
		int kopo09_countStar, kopo09_countBlank;	// Integer type variables(kopo09_countStar, kopo09_countBlank) declaration
											// kopo09_countStar means the number of stars
											// kopo09_countBlank means the number of blanks from the left
		kopo09_countStar = 1;	// row from the first
		kopo09_countBlank = 20;	//Blanks are from the 20th
		
		while(true) {	// loop
			for(int i = 0; i < kopo09_countBlank ; i++) System.out.printf(" ");	// Enter the blanks as many as value of kopo09_countBlank
			for(int i = 0; i < kopo09_countStar; i++) System.out.printf("*");	// Enter the stars as many as value of kopo09_countStar
			System.out.printf("\n");
			
			kopo09_countStar += 2;	// Stars increase by 2
			kopo09_countBlank -= 1;	// and blanks decrease by 1.
			
			if(kopo09_countBlank < 0) break;	// If the blank is negative, the loop is escaped
		}
	}

}
