package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short a = s.nextShort();
		short h, m, t;
		h = (short) (a / 3600);
		t = (short) (a % 3600);
		m = (short) (t / 60);
		t = (short) (t % 60);

		System.out.println(h + ":" + m + ":" + t);
	}

}
