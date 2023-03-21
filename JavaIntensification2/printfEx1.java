package JavaIntensification2;

public class printfEx1 {

	//How to use printf1
	public static void main(String[] args) {
		byte kopo09_b = 1;	// Byte type variable(kopo09_b) declaration and initialize it to 1
		short kopo09_s = 2;	// Short type variable(kopo09_s) declaration and initialize it to 2
		char kopo09_c = 'A';	// Char type variable(kopo09_c) declaration and initialize it to A
		
		int kopo09_finger = 10;	// Integer type variable(kopo09_finger) declaration and initialize it to 10
		long kopo09_big = 100000000000L;	// Long type variable(kopo09_big) declaration and initialize it to 100000000000, L means long type
		long kopo09_hex = 0xFFFFFFFFFFFFFFFL;	// Long type variable(kopo09_hex) declaration and initialize it to 0xFFFFFFFFFFFFFFF(Hexadecimal), L means long type

		int kopo09_octNum = 010;	// octal number(10), decimal number(8)
		int kopo09_hexNum = 0x10;	// hexadecimal(10), decimal number(16)
		int kopo09_binNum = 0b10;	// binary number(10), decimal number(2)

		System.out.printf("b=%d%n", kopo09_b);	// Print kopo09_b
		System.out.printf("s=%d%n", kopo09_s);	// Print kopo09_s
		System.out.printf("c=%c%n", kopo09_c);	// Print kopo09_c
		System.out.printf("finger=[%5d]%n", kopo09_finger);	// Print kopo09_finger, [%5d] = Print from the back after securing 5 spaces and the remaining space is blank
		System.out.printf("finger=[%-5d]%n", kopo09_finger);	// Print kopo09_finger, [%-5d] = Print from the front after securing 5 spaces and the remaining space is blank
		System.out.printf("finger=[%05d]%n", kopo09_finger);	// Print kopo09_finger, [%05d] = Print from the back after securing 5 spaces and the remaining space is 0
		System.out.printf("big=%d%n", kopo09_big);	// Print kopo09_big
		System.out.printf("hex=%#x%n", kopo09_hex);	// Print kopo09_hex
		
		System.out.printf("octNum=%o, %d%n",kopo09_octNum, kopo09_octNum);	// Print kopo09_octNum, %o(octal number)
		System.out.printf("hexNum=%x, %d%n",kopo09_hexNum, kopo09_hexNum);	// Print kopo09_hex, %x(hexadecimal)
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(kopo09_binNum), kopo09_binNum);	// Print kopo09_binNum, Integer.toBinaryString() = type casting(Binary to String)
		
	}

}
