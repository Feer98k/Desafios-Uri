package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri23420 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short a, b, l;
		l = s.nextShort();
		a = s.nextShort();
		String g = s.next();
		b = s.nextShort();
		s.close();

		switch (g) {
		case "+":

			if ((a + b) <= l) {
				System.out.println("OK");
			} else {
				System.out.println("OVERFLOW");
				
			}
			break;
		case "*":
			if ((a * b) <= l) {
				System.out.println("OK");
			} else {
				System.out.println("OVERFLOW");
			}
			break;
		}
		
	}
}
