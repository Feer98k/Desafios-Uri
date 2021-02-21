package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri1035 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short a, b, c, d;
		a = s.nextShort();
		b = s.nextShort();
		c = s.nextShort();
		d = s.nextShort();
		s.close();
		if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
