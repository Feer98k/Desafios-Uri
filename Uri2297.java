package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri2297 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		short aldo, beto;
		byte count = 0;
		short i;
		int z;
		short rodadas, testes = 0;

		for (z=1;;z++){
			aldo=0;
			beto=0;
			rodadas = scanner.nextShort();
			if (rodadas == 0) {
				count = 1;
				break;
			}
			testes++;
			for (i = 0; i < rodadas; i++) {
				aldo += aldo = scanner.nextShort();
				beto += beto = scanner.nextShort();

			}
			System.out.println("Teste " + testes);
			if (aldo > beto) {
				System.out.println("Aldo\n\n");
				
			}
			if (beto > aldo) {
				System.out.println("Beto\n\n");
				
			}
			
		}
	}
}
