package classes;

import java.util.Locale;
import java.util.Scanner;
/**
 * a=Salario inicial
 * b= Salario Inicial + % de aumento
 * r=Valor integral do reajuste
 * p = porcetagem de aumento
 * @author Ferna
 *
 */
public class uri1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		float b = 0, r = 0;
		s.close();
		String p = "";
		if (a >= 0 && a <= 400) {
			b = (float) ((a * 0.15) + a);
			r = (b - a);
			p = "15 %";
		}
		if (a > 400 && a <= 800) {
			b = (float) ((a * 0.12) + a);
			r = (b - a);
			p = "12 %";
		}
		if (a > 800 && a <= 1200) {
			b = (float) ((a * 0.10) + a);
			r = (b - a);
			p = "10 %";
		}
		if (a > 1200 && a <= 2000) {
			b = (float) ((a * 0.07) + a);

			r = (b - a);
			p = "7 %";
		}
		if (a > 2000) {
			b = (float) ((a * 0.04) + a);
			r = (b - a);
			p = "4 %";
		}
		System.out.printf("Novo salario: %.2f\n", b);
		System.out.printf("Reajuste ganho: %.2f\n", r);
		System.out.println("Em percentual: "+p);

	}

}
