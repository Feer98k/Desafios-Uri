package classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float n, n1, n2, n3, m1, e;
		n = s.nextFloat() * 2;
		n1 = s.nextFloat() * 3;
		n2 = s.nextFloat() * 4;
		n3 = s.nextFloat();
		m1 = (n + n1 + n2 + n3) / 10;
		BigDecimal bd = new BigDecimal(m1).setScale(1, RoundingMode.HALF_EVEN);
		if (m1 > 7) {
			System.out.printf("Media: %.1f\n", bd.doubleValue());
			System.out.print("Aluno aprovado.\n");
		} else if (m1 < 5) {

			System.out.printf("Media: %.1f\n", bd.doubleValue());
			System.out.print("Aluno reprovado.\n");

		}

		else if (m1 >= 5 && m1 <= 6.9) {
			e = s.nextFloat();
			System.out.printf("Media: %.1f\n", bd.doubleValue());
			System.out.print("Aluno em exame.\n");
			System.out.printf("Nota do exame: %.1f\n", e);
			m1 = (m1 + e) / 2;
			if (m1 >= 5) {

				System.out.print("Aluno aprovado.\n");
			} else {

				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f", m1);
			s.close();
		}
	}

}
