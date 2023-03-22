package Lesson2;

public class PrintfEx2 {
	// How to use printf2
	public static void main(String[] args) {
		String kopo09_url = "www.cokopo09_dechobo.com";	// String type variable(kopo09_url) declaration and initialize it to "www.cokopo09_dechobo.com"
		float kopo09_f1 = .10f;	// Float type variable(kopo09_f1) declaration and initialize it to 0.1
		float kopo09_f2 = 1e1f;	// Float type variable(kopo09_f2) declaration and initialize it to 10(=1 * 10^1 )
		float kopo09_f3 = 3.14e3f;	// Float type variable(kopo09_f3) declaration and initialize it to 3140(=3.14 * 10^3)
		double kopo09_d = 1.23456789;	// Double type variable(kopo09_d) declaration and initialize it to 1.23456789

		System.out.printf("f1=%f, %e, %g%n", kopo09_f1, kopo09_f1, kopo09_f1);	// Print kopo09_f1, %f(float), %e(exponential), %g(real number)
		System.out.printf("f2=%f, %e, %g%n", kopo09_f2, kopo09_f2, kopo09_f2);	// Print kopo09_f2
		System.out.printf("f3=%f, %e, %g%n", kopo09_f3, kopo09_f3, kopo09_f3);	// Print kopo09_f3

		System.out.printf("d=%f%n", kopo09_d);	// Print kopo09_d
		System.out.printf("d=%14.10f%n", kopo09_d);	// Print kopo09_d, %14.10f (14 digits including decimal places and 10 decimal places)

		System.out.printf("[1234567890]%n");	// Print [1234567890]
		System.out.printf("[%s]%n", kopo09_url);	// Print kopo09_url value(all)
		System.out.printf("[%20s]%n", kopo09_url);	// Print kopo09_url value(Print from the back after securing 20 spaces, 20 characters or more)
		System.out.printf("[%-20s]%n", kopo09_url);	// Print kopo09_url value(Print from the front after securing 20 spaces, 20 characters or more)
		System.out.printf("[%.8s]%n", kopo09_url);	// Print kopo09_url value(Only 8 characters)
	}
}
