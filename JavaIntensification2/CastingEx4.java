package JavaIntensification2;

public class CastingEx4 {
	//How to type casting
	public static void main(String[] args) {
		int kopo09_i = 91234567;	// Integer type variable(kopo09_f) declaration and initialize it to 91234567
		float kopo09_f = (float)kopo09_i;	// type casting(integer to float)
		int kopo09_i2 = (int)kopo09_f;		// type casting(float to int)

		double kopo09_d = (double)kopo09_i;	// type casting(integer to double)
		int kopo09_i3 = (int)kopo09_d;	// type casting(double to integer)
		
		float kopo09_f2 = 1.666f;	// Float type variable(kopo09_f) declaration and initialize it to 1.666
		int kopo09_i4 = (int)kopo09_f2;	// type casting(float to integer)

		System.out.printf("i =%d\n", kopo09_i);	// Print kopo09_i
		System.out.printf("f =%f i2=%d\n", kopo09_f, kopo09_i2);	// Print kopo09_f, kopo09_i2
		System.out.printf("d =%f i3=%d\n", kopo09_d, kopo09_i3);	// Print kopo09_d, kopo09_i3
		System.out.printf("(int)%f =%d\n", kopo09_f2,kopo09_i4);	// Print kopo09_f2, kopo09_i4
		
	}

}