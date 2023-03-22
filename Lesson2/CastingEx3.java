package Lesson2;

public class CastingEx3 {
	//How to type casting
	public static void main(String[] args) {
		float kopo09_f = 9.1234567f;	// float type variable(kopo09_f) declaration and initialize it to 9.1234567
		double kopo09_d = 9.1234567;	// float type variable(kopo09_d) declaration and initialize it to 9.1234567
		double kopo09_d2 = (double)kopo09_f;		// type casting(float to double)

		System.out.printf("f =%20.18f\n", kopo09_f);	// Print kopo09_f
		System.out.printf("f =%20.18f\n", kopo09_d);	// Print kopo09_d
		System.out.printf("f =%20.18f\n", kopo09_d2);	// Print kopo09_d2
		
	}

}