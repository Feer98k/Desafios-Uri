package classes;

import java.util.Scanner;

public class uri1133 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		short x, y,i;
		x = s.nextShort();
		y = s.nextShort();
		s.close();
		if (x > y) {
			for (i=(short) (y+1); i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		} else {
			for (i=(short) (x+1); i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}

			}
		}

	}
}