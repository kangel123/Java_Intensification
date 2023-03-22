package Lesson2;

public class CastingEx2 {
	// How to type casting
	public static void main(String[] args) {
		int kopo09_i = 10;	// Integer type variable(kopo09_i) declaration and initialize it to 10
		byte kopo09_b = (byte)kopo09_i;	// type casting(integer to byte)
		System.out.printf("[int -> byte] i=%d -> b=%d%n",kopo09_i,kopo09_b);	// Print result

		kopo09_i = 300;	// Change the value of kopo09_i to 300
		kopo09_b = (byte)kopo09_i;	// type casting(integer to byte)
		System.out.printf("[int -> byte] i=%d -> b=%d%n",kopo09_i,kopo09_b);	// Print result
		
		kopo09_b = 10;	//Change the value of kopo09_b to 10
		kopo09_i = (int)kopo09_b;	// type casting(byte to integer)
		System.out.printf("[byte -> int] b=%d -> i=%d%n",kopo09_b,kopo09_i);	// Print result
		
		kopo09_b = -2;	//Change the value of kopo09_b to -2
		kopo09_i = (int)kopo09_b;	// type casting(byte to integer)
		System.out.printf("[byte -> int] b=%d -> i=%d%n",kopo09_b,kopo09_i);	// Print result
		
		System.out.println("i="+Integer.toBinaryString(kopo09_i));	// Output in 2's complement form
	}

}