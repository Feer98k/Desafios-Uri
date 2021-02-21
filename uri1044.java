package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short i;
		short a = s.nextShort(), b = s.nextShort(), c, r = 0;
		s.close();
		for (i = 1; i<=100; i++) {
			if(a<b) {
			c = (short) (a * i);
			if (c == b) {
				r = 1;
				break;
			}
		}
			else {
				c = (short) (b * i);
				if (c == a) {
					r = 1;
					break;
				}
			}
		}
		if (r == 1) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}
