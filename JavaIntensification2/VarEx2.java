package JavaIntensification2;	// package declaration

public class VarEx2 {	// class declaration

	// Use integer type 2
	public static void main(String[] args) {	// main method start
		int kopo09_x = 10; // Interger type variable(kopo09_x) declaration and initialize it to 10
		int kopo09_y = 20; // Interger type variable(kopo09_y) declaration and initialize it to 20
		int kopo09_tmp = 0; // Interger type variable(kopo09_tmp) declaration and initialize it to 0

		System.out.println("x:" + kopo09_x + " y:" + kopo09_y);	//Print kopo09_x, kopo09_y value
		
		// Change x,y values ​​to each other
		kopo09_tmp = kopo09_x;	//Give the value of kopo09_x to kopo09_tmp
		kopo09_x = kopo09_y;	//Give the value of kopo09_y to kopo09_x
		kopo09_y = kopo09_tmp;	//Give the value of kopo09_tmp to kopo09_y
		System.out.println("x:" + kopo09_x + " y:" + kopo09_y);	//Print kopo09_x, kopo09_y value
	}

}
