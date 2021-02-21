package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte id = s.nextByte();
		byte q = s.nextByte();
		double t = 0;
		s.close();
		switch (id) {
		case 1:
			t =  (q * 4.0);
			break;

		case 2:
			t = q * 4.5;
			break;
		case 3:
			t =  q * 5.0;
			break;
		case 4:
			t =  q * 2;
			break;
		case 5:
			t =  q * 1.5;
			break;
		}
		String f=String.format("%.2f", t);
		System.out.println("Total: R$ "+f);

	}

}
