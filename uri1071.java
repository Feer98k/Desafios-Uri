package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1071 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int a = 0, c = 0, r = 0, d = 0;
		a = s.nextInt();
		c = s.nextInt();
		if (a > c) {
			for (d = (c + 1); d < a; d++) {

				if (d % 2 != 0) {
					r += d;

				}
			}
		} else {
			for (d = (a + 1); d < c; d++) {
				if (d % 2 != 0) {
					r += d;

				}
			}
		}
		s.close();
		System.out.println(r);

	}

}
