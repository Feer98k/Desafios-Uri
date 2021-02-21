package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte a = s.nextByte(), b = s.nextByte(), r = 0;
		s.close();
		if (a == b) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (a > b) {
			r = (byte) ((b + 24) - a);
			System.out.printf("O JOGO DUROU %d HORA(S)\n", r);
		} else if (b > a) {
			r = (byte) (b - a);
			System.out.printf("O JOGO DUROU %d HORA(S)\n", r);
		}
	}
}
