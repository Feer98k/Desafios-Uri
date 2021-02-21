package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1099 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short x = 0, y = 0, t = 0;
		t = s.nextShort();
		short v[] = new short[t];
		for (int i = 0; i < t; i++) {
			x = s.nextShort();
			y = s.nextShort();
			if (x < y) {
				int e = 0;
				for (int j = x + 1; j < y; j++) {
					if (j % 2 == 1) {
						e +=j;
						v[i] = (short) e;
					}
				}
			} else if (x > y) {
				int e = 0;
				for (int j = y + 1; j < x; j++) {
					if (j % 2 == 1) {
						e += j;
						v[i] = (short) e;
					}
				}
			}
		}
		s.close();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

}
