package Lesson2;

public class OverflowEx {

	// overflow(out of range)
	public static void main(String[] args) {
		short kopo09_sMin = -32768;	// Short type variable(kopo09_sMin) declaration and initialize it to -32768
		short kopo09_sMax = 32767;	// Short type variable(kopo09_sMax) declaration and initialize it to 32767
		char kopo09_cMin = 0;	// Char type variable(kopo09_cMin) declaration and initialize it to 0
		char kopo09_cMax = 65535;	// Char type variable(kopo09_cMax) declaration and initialize it to 65535

		System.out.println("sMin = " + kopo09_sMin);	// Print kopo09_sMin
		System.out.println("sMin-1 = " + (short)(kopo09_sMin-1));	// // Print kopo09_sMin-1, Overflow error
		System.out.println("sMax = " + kopo09_sMax);	// Print kopo09_sMax
		System.out.println("sMax+1 = " + (short)(kopo09_sMax+1));	// Print kopo09_sMax+1, Overflow error
		System.out.println("cMin = " + (int)kopo09_cMin);	// Print kopo09_cMin
		System.out.println("cMin-1 = " + (int)--kopo09_cMin);	// Print kopo09_cMin-1, Overflow error
		System.out.println("cMax = " + (int)kopo09_cMax);	// Print kopo09_cMax
		System.out.println("cMax+1 = " + (int)++kopo09_cMax);	// Print kopo09_cMax+1, Overflow error
	}

}
