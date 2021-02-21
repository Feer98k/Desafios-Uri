package classes;

import java.util.Locale;
import java.util.Scanner;
/**
 * https://www.udebug.com/URI/1047
 * @author Fernando
 *
 */
public class uri1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte h1 = s.nextByte(), m1 = s.nextByte(), h2 = s.nextByte(), m2 = s.nextByte(), rh = 0, rm = 0;
		s.close();
		if (h1 == h2 && m1 == m2) {
			rh = 24;
			rm = 0;
		} else if (h1 == h2) {
			if (m1 > m2) {
				rh = 23;
				rm = (byte) (60 - (m1 - m2));
			} else if (m2 < m1) {
				rh = 0;
				rm = (byte) (m2 - m1);
			}
		}

		else if (h1 > h2) {
			if ((h1 - h2 > 1) && m1 < m2) {
				rh = (byte) (24 - (h1 - h2));
			} else if ((h1 - h2 > 1) && m1 > m2) {
				rh = (byte) (23 - (h1 - h2));
			}
		} else if (h1 - h2 == 1) {
			rh = (byte) (23 - (h1 - h2));

		} else if (h1 < h2) {
			if (((h2 - h1) > 1) && m2 > m1) {
				rh = (byte) (h2 - h1);
			} else if (((h2 - h1) > 1) && m2 < m1) {
				rh = (byte) ((h2 - h1) - 1);

			} else if ((h2 - h1 == 1) && (m1 == m2)) {
				rh = (byte) (h2 - h1);
			} else if ((h2 - h1 == 1) && (m1 != m2)) {
				rh = 0;
			}
		}

		if (m1 < m2) {
			rm = (byte) (m2 - m1);
		} else if (m1 > m2) {
			rm = (byte) (60 - (m1 - m2));
		}
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", rh, rm);
	}
}