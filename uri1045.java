package classes;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		List<Float> l = new Vector<>();
		float a = 0, b = 0, c = 0;
		for (byte i = 0; i < 3; i++) {
			float t = s.nextFloat();
			l.add(t);
		}
		Collections.sort(l);
		a = l.get(2);
		b = l.get(1);
		c = l.get(0);

		
		if(!forma(a,b,c)) {
			
		 if ((a * a) == ((b * b) + (c * c))) {
				System.out.println("TRIANGULO RETANGULO");
			}
		 if ((a*a)>((b*b)+(c*c))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
		 if ((a * a) < ((b * b) + (c * c))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
		 if (a == b && a == c && c == b) {
				System.out.println("TRIANGULO EQUILATERO");
			}
		 if (is(a, b, c)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}else {
			System.out.println("NAO FORMA TRIANGULO");
		}
	}

	static boolean  forma(float a, float b, float c) {
		if (a >= (b + c)) {
			
			return true;
		}
		return false;
	}

	static boolean is(float aa, float bb, float cc) {
		byte cou = 0;
		if (aa == bb) {
			cou++;
		}
			if (aa == cc) {
			cou++;
		}
			if (bb == cc) {
			cou++;
		}
		if (cou == 1) {
			return true;

		}
		return false;
	}
	 
}
