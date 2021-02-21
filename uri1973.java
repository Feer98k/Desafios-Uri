package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1973 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte e = s.nextByte(), c = 0;
		short ovelhas = 0, confere = 0, ataq = 0;
		byte pr;
		short v[] = new short[e];
		for (byte i = 0; i < e; i++) {
			c = s.nextByte();
			v[i] = c;
			ovelhas += c;

		}

		for (pr = 0; pr < e; pr++) {
			if (v[pr] != 0) {
				confere = v[pr];
				if (confere % 2 != 0) {
					ovelhas--;
					v[pr]--;
					ataq++;
				} else {
					for (byte j = (byte) (pr - 1); j >= 1; j--) {
						ovelhas--;
						v[j]--;
					}

				}
			}
		}

		System.out.printf("%d %d", ataq, ovelhas);
	}
}
