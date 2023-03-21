package JavaIntensification2;

public class StringEx {

	// Use string type
	public static void main(String[] args) {
		String kopo09_name = "Ja" + "va"; // Concatenate strings Ja and va, store the value in kopo09_name
		String kopo09_str = kopo09_name + 8.0; // Concatenate strings Java(kopo09_name value) and 8.0, store the value in kopo09_name

		System.out.println(kopo09_name); // Print kopo09_name
		System.out.println(kopo09_str); // Print kopo09_str
		System.out.println(7 + " "); // Print "7 "
		System.out.println(" " + 7); // Print " 7"
		System.out.println(7 + ""); // Print "7"
		System.out.println("" + 7); // Print "7"
		System.out.println("" + ""); // Print ""
		System.out.println(7 + 7 + ""); // Print 7 + 7 + "" = 14 + "" = "14"
		System.out.println("" + 7 + 7); // Print "" + 7 + 7 = "7" + 7 = "77"
	}

}
