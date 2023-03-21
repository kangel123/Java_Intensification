package JavaIntensification2; // package declaration

public class VarEx1 { // class declaration

	// Use integer type 1
	public static void main(String[] args) { // main method start
		int kopo09_year = 0; // Interger type variable(kopo09_year) declaration and initialize it to 0
		int kopo09_age = 14; // Interger type variable(kopo09_age) declaration and initialize it to 14

		System.out.println(kopo09_year); // Print kopo09_year value
		System.out.println(kopo09_age); // Print kopo09_year value

		kopo09_year = kopo09_age + 2000; // Add 2000 to kopo09_age and store the value in kopo09_year
		kopo09_age = kopo09_age + 1; // Add 1 to kopo09_age and store the value in kopo09_age

		System.out.println(kopo09_year); // Print kopo09_year value
		System.out.println(kopo09_age); // Print kopo09_year value
	}
}
